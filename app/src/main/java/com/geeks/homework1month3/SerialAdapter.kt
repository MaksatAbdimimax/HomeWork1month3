package com.geeks.homework1month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geeks.homework1month3.databinding.ItemSerialBinding
import com.geeks.homework1month3.data.SerialModel

class SerialAdapter(val serialList: ArrayList<SerialModel>, val onClick: (SerialModel)-> Unit):
    RecyclerView.Adapter< SerialAdapter.SerialViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SerialViewHolder {
        return SerialViewHolder(
            ItemSerialBinding.inflate(
                LayoutInflater
            .from(parent.context),parent,false))
    }

    override fun onBindViewHolder(
        holder: SerialViewHolder,
        position: Int
    ) {
       holder.onBind(serialList[position])
    }

    override fun getItemCount(): Int = serialList.size



    inner class SerialViewHolder(private val binding: ItemSerialBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(serialModel: SerialModel) {
            binding.tvName.text = serialModel.name
            binding.tvEpisode.text = serialModel.episode
            binding.tvDate.text = serialModel.date
            Glide.with(binding.imgSerial).load(serialModel.img).into(binding.imgSerial)

            binding.root.setOnClickListener {
                onClick(serialModel)
            }
        }

      }
}