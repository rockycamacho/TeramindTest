package com.rockycamacho.teramind.app.presentation.useractivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.rockycamacho.teramind.app.R
import com.rockycamacho.teramind.app.data.models.ActivityType
import com.rockycamacho.teramind.app.data.models.UserActivity
import kotlinx.android.synthetic.main.fragment_user_activity.*
import org.threeten.bp.LocalDateTime

class UserActivityFragment : Fragment() {

    companion object {

        fun newInstance(): UserActivityFragment {
            val fragment = UserActivityFragment()
            return fragment
        }

    }

    lateinit var adapter: UserActivityAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_activity, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter = UserActivityAdapter(requireActivity()) { userActivity ->
            Toast.makeText(requireContext(), "Clicked ${userActivity.name}", Toast.LENGTH_SHORT).show()
        }
        list.setHasFixedSize(true)
        list.layoutManager = LinearLayoutManager(requireActivity())

        list.adapter = adapter

        val userActivities = initializeData()
        adapter.submitList(userActivities)
//        swipeToRefresh.setOnRefreshListener {
//            adapter.submitList(userActivities)
//        }
    }

    private fun initializeData(): List<UserActivity> {
        val userActivities = listOf(
            UserActivity(
                name = "Sent Suspicious Email",
                type = ActivityType.EMAIL,
                timestamp = LocalDateTime.of(2018, 9, 13, 15, 28)
            ),
            UserActivity(
                name = "Launched Game App",
                type = ActivityType.GAME,
                timestamp = LocalDateTime.of(2018, 9, 12, 18, 5)
            ),
            UserActivity(
                name = "Was Idle for 2 hrs",
                type = ActivityType.IDLE,
                timestamp = LocalDateTime.of(2018, 9, 11, 10, 32)
            ),
            UserActivity(
                name = "Launched Game App",
                type = ActivityType.GAME,
                timestamp = LocalDateTime.of(2018, 9, 10, 18, 5)
            ),
            UserActivity(
                name = "Was Idle for 1 hrs",
                type = ActivityType.IDLE,
                timestamp = LocalDateTime.of(2018, 9, 10, 10, 32)
            )
        )
        return userActivities
    }

}
