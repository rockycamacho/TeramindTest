package com.rockycamacho.teramind.app.presentation.analytics

import androidx.recyclerview.widget.DiffUtil
import com.rockycamacho.teramind.app.data.models.Analytics

class AnalyticsListCallback : DiffUtil.ItemCallback<Analytics>() {
    override fun areItemsTheSame(oldItem: Analytics, newItem: Analytics): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Analytics, newItem: Analytics): Boolean {
        return oldItem.value == newItem.value &&
                oldItem.metric == newItem.metric

    }

}