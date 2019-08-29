package com.rockycamacho.teramind.app.presentation

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.rockycamacho.teramind.app.presentation.analytics.AnalyticsFragment
import com.rockycamacho.teramind.app.presentation.livescreen.LiveScreenFragment
import com.rockycamacho.teramind.app.presentation.useractivity.UserActivityFragment

class MainPagerAdapter(context: Context, fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> UserActivityFragment.newInstance()
            1 -> AnalyticsFragment.newInstance()
            2 -> LiveScreenFragment.newInstance()
            else -> TODO("Implement fragment for position: $position")
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "ACTIVITY"
            1 -> "ANALYTICS"
            2 -> "LIVE SCREEN"
            else -> TODO("Implement page title for position: $position")
        }
    }

    override fun getCount(): Int = 3

}
