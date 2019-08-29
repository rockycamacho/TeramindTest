package com.rockycamacho.teramind.app.presentation.useractivity

import androidx.recyclerview.widget.DiffUtil
import com.rockycamacho.teramind.app.data.models.UserActivity

class UserActivityListCallback : DiffUtil.ItemCallback<UserActivity>() {
    override fun areItemsTheSame(oldItem: UserActivity, newItem: UserActivity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: UserActivity, newItem: UserActivity): Boolean {
        return oldItem.name == newItem.name &&
                oldItem.timestamp == newItem.timestamp

    }

}
