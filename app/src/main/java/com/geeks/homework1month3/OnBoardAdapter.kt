package com.geeks.homework1month3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.homework1month3.data.OnBoardModel
import com.geeks.homework1month3.databinding.ItemOnBordBinding

class OnBoardAdapter(val  onBoardList: List<OnBoardModel>,
                     val  onStart:() -> Unit,
                     val  onSkip:(Int) -> Unit):

    RecyclerView.Adapter<OnBoardAdapter.
    OnBoardViewHolder> () {






        override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OnBoardViewHolder {
        return OnBoardViewHolder(ItemOnBordBinding.inflate(
            LayoutInflater.from(parent.context)
        ,parent,false))
    }

    override fun onBindViewHolder(
        holder: OnBoardViewHolder,
        position: Int
    ) {
        holder.onBind(onBoardList[position],position)
    }

    override fun getItemCount(): Int {
        return onBoardList.size
    }



   inner class OnBoardViewHolder(private val binding: ItemOnBordBinding) : RecyclerView.ViewHolder
        (binding.root){
        fun onBind(onBoardModel: OnBoardModel, position: Int){
            with(binding){

            }
            binding.apply {
                tvTitle.text = onBoardModel.title
                tvDesc.text = onBoardModel.desc
            }
            binding.tvSkip.setOnClickListener {
                onSkip(position)
            }
            binding.btnStart.setOnClickListener {
                onStart()
            }
            if (position == onBoardList.size -  1){
                binding.tvSkip.visibility = View.INVISIBLE
            } else {
                binding.btnStart.visibility = View.INVISIBLE
            }
        }
    }

}