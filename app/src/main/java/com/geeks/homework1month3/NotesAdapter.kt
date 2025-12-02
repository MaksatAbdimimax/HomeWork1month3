package com.geeks.homework1month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.homework1month3.data.NotesModel
import com.geeks.homework1month3.databinding.ItemNotesBinding
import com.geeks.homework1month3.databinding.ItemOnBordBinding

class NotesAdapter(private val notesList: List<NotesModel>, val onClick:(NotesModel) -> Unit ):
    RecyclerView.Adapter<NotesAdapter.NotesViewHoleder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NotesViewHoleder {
        return NotesViewHoleder(ItemNotesBinding.inflate(LayoutInflater.from(parent.context),parent,
            false))
    }

    override fun onBindViewHolder(
        holder: NotesViewHoleder,
        position: Int
    ) {
       holder.onBind(notesList[position])
    }

    override fun getItemCount(): Int {
        return  notesList.size
    }

    inner class NotesViewHoleder(private val binding: ItemNotesBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun onBind(notesModel: NotesModel){
            binding.tvNotes.text = notesModel.title
            binding.tvDesc.text = notesModel.desc

            itemView.setOnClickListener {
                onClick(notesModel)
            }
        }
    }

}