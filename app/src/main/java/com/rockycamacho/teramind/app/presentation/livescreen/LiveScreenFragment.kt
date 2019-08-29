package com.rockycamacho.teramind.app.presentation.livescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rockycamacho.teramind.app.R

class LiveScreenFragment : Fragment() {

    companion object {

        fun newInstance(): LiveScreenFragment {
            val fragment = LiveScreenFragment()
            return fragment
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_live_screen, container, false)
    }

}
