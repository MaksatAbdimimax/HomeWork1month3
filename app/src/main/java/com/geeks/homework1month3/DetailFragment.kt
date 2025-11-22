package com.geeks.homework1month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.geeks.homework1month3.databinding.FragmentDetailBinding
import com.geeks.homework1month3.DetailFragmentArgs


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val model  =  args.model


            with(binding){
                imgSerial.loadImg(model.img)
                tvTitle.text = model.name
                tvEpisode.text = model.episode
                tvDate.text = model.date
            }


    }
}
fun ImageView.loadImg(img: String){
    Glide.with(this).load(img).into(this)
}