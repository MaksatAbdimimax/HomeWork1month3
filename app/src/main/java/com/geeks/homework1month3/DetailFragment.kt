package com.geeks.homework1month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.geeks.homework1month3.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val model  =  arguments?.getSerializable("key") as SerialModel?

        if (model != null) {
            Glide.with(binding.imgSerial).load(model.img).into(binding.imgSerial)
            binding.tvTitle.text = model.name
            binding.tvEpisode.text = model.episode
            binding.tvDate.text = model.date
        }

    }
}