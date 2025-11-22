    package com.geeks.homework1month3

    import android.os.Bundle
    import androidx.fragment.app.Fragment
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.navigation.fragment.findNavController
    import androidx.navigation.navOptions
    import androidx.viewpager2.widget.ViewPager2
    import com.geeks.homework1month3.data.OnBoardModel
    import com.geeks.homework1month3.databinding.FragmentOnBordBinding
    import me.relex.circleindicator.CircleIndicator3

    class OnBordFragment : Fragment() {

        private lateinit var binding: FragmentOnBordBinding
        private lateinit var adapter: OnBoardAdapter


        private lateinit var indicator: CircleIndicator3

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentOnBordBinding.inflate(inflater,container,false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            adapter = OnBoardAdapter(getOnBoardlist(),:: onClickStart, :: onSkip)

            binding.vpNotes.adapter = adapter

            indicator = binding.indicator


            indicator.setViewPager( binding.vpNotes)
        }

        private fun onClickStart(){
            findNavController().navigate(
                R.id.mainFragment,
                null,
                navOptions {
                    popUpTo(R.id.onBordFragment) {
                        inclusive = true
                    }
                }
            )
        }

        private fun onSkip(position: Int) {
            binding.vpNotes.currentItem = position + 1
        }

        fun getOnBoardlist(): List <OnBoardModel>{
            return listOf(
                OnBoardModel(
                    title = "Udobustvo",
                    desc = "UdobustvoUdobustvoUdobustvoUdobustvoUdobustvoUdobustvo"
                ),
                OnBoardModel(
                    title = "Udobustvo",
                    desc = "UdobustvoUdobustvoUdobustvoUdobustvoUdobustvoUdobustvo"
                ),
                OnBoardModel(
                    title = "Udobustvo",
                    desc = "UdobustvoUdobustvoUdobustvoUdobustvoUdobustvoUdobustvo"
                )


            )
        }
    }