package com.geeks.homework1month3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geeks.homework1month3.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    private lateinit var adapter: SerialAdapter

    private var listSerial = arrayListOf<SerialModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = SerialAdapter(listSerial, onClick = { model ->
            /*Log.d("ololo", "onViewCreated: ${model.name}")
            val bundle = Bundle ()
            bundle.putSerializable("key", model)
            val detailFragment = DetailFragment()
            detailFragment.arguments = bundle*/



                findNavController().navigate(
                    MainFragmentDirections.actionMainFragmentToDetailFragment(model))
            /*requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container, detailFragment).addToBackStack(null  )
                .commit()*/
        })
        binding.rvSerials.adapter = adapter

    }
    fun loadData(){
        listSerial.add(SerialModel(img = "https://i.pinimg.com/236x/84/a6/e0/84a6e0b28c3ef9ad78e28cfac6651533.jpg?nii=t",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://upload.wikimedia.org/wikipedia/en/5/51/Rise_of_empires_ottoman.jpg",
            name = "Chenobyl", episode = "S1.E5", date = "2033"))
        listSerial.add(SerialModel(img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVukqQMfCvC_YS4BfiIv__jpHb9J2zUvaRdA&s",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://i.pinimg.com/236x/84/a6/e0/84a6e0b28c3ef9ad78e28cfac6651533.jpg?nii=t",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://upload.wikimedia.org/wikipedia/en/5/51/Rise_of_empires_ottoman.jpg",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVukqQMfCvC_YS4BfiIv__jpHb9J2zUvaRdA&s",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://i.pinimg.com/236x/84/a6/e0/84a6e0b28c3ef9ad78e28cfac6651533.jpg?nii=t",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://upload.wikimedia.org/wikipedia/en/5/51/Rise_of_empires_ottoman.jpg",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVukqQMfCvC_YS4BfiIv__jpHb9J2zUvaRdA&s",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://i.pinimg.com/236x/84/a6/e0/84a6e0b28c3ef9ad78e28cfac6651533.jpg?nii=t",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://upload.wikimedia.org/wikipedia/en/5/51/Rise_of_empires_ottoman.jpg",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
        listSerial.add(SerialModel(img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVukqQMfCvC_YS4BfiIv__jpHb9J2zUvaRdA&s",
            name = "Chenobyl", episode = "S1.E5", date = "2019"))
    }
}