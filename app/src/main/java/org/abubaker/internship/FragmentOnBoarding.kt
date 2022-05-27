package org.abubaker.internship

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.acxdev.commonFunction.util.view.OtherViewX.Companion.html
import org.abubaker.internship.databinding.FragmentOnBoardingBinding

class FragmentOnBoarding : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentOnBoardingBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        // We are using HTML Markup so we can assign different colors to individual words.
        val string =
            "<font color=#304675>Find</font> <font color=#0DAB4E>Dream <br>Internship</font> <font color=#304675>Program</font>"

        binding.title.html(string)

    }

}