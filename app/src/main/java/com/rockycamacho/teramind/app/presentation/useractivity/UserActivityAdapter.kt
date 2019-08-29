package com.rockycamacho.teramind.app.presentation.useractivity

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.rockycamacho.teramind.app.R
import com.rockycamacho.teramind.app.data.models.UserActivity

class UserActivityAdapter(val context: Context, val moreListener: (UserActivity) -> Unit
) : ListAdapter<UserActivity, UserActivityViewHolder>(UserActivityListCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserActivityViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_user_activity, parent, false)
        return UserActivityViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserActivityViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, moreListener)
    }

}
