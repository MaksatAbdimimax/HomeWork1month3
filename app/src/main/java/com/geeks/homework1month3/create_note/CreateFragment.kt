package com.geeks.homework1month3.create_note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.geeks.homework1month3.DetailFragmentArgs
import com.geeks.homework1month3.R
import com.geeks.homework1month3.data.NotesModel
import com.geeks.homework1month3.databinding.FragmentCreateBinding
import com.geeks.homework1month3.ui.App
import kotlin.getValue


class CreateFragment : Fragment() {

    private lateinit var binding: FragmentCreateBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSave.setOnClickListener {

            val title = binding.edTitle.text.toString()
            val desc = binding.edDesc.text.toString()

            App.db.dao().insert(NotesModel(title = title, desc = desc))
            findNavController().navigateUp()
        }

    }

}