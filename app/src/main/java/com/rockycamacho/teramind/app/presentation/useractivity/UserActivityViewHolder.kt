package com.rockycamacho.teramind.app.presentation.useractivity

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.rockycamacho.teramind.app.R
import com.rockycamacho.teramind.app.data.models.ActivityType
import com.rockycamacho.teramind.app.data.models.UserActivity
import kotlinx.android.synthetic.main.item_user_activity.view.*
import org.threeten.bp.format.DateTimeFormatter

class UserActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: UserActivity, moreListener: (UserActivity) -> Unit) {
        val activityTypeImage = getActivityTypeImage(item)
        itemView.activity_icon.setImageResource(activityTypeImage)
        itemView.activity_name.text = item.name
        val formatter = DateTimeFormatter.ofPattern("d MMM HH:mm")
        itemView.activity_timestamp.text = formatter.format(item.timestamp)
        itemView.more_button.setOnClickListener { moreListener.invoke(item) }
    }

    private fun getActivityTypeImage(item: UserActivity): Int {
        return when (item.type) {
            ActivityType.GAME -> R.drawable.ic_videogame_asset_black_24dp
            ActivityType.IDLE -> R.drawable.ic_access_time_black_24dp
            ActivityType.EMAIL -> R.drawable.ic_email_black_24dp
            else -> R.drawable.ic_access_time_black_24dp
        }
    }

}
