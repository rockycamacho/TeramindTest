package com.rockycamacho.teramind.app.presentation.analytics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.rockycamacho.teramind.app.R
import com.rockycamacho.teramind.app.data.models.Analytics

class AnalyticsAdapter : ListAdapter<Analytics, AnalyticsViewHolder>(AnalyticsListCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnalyticsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_analytics, parent, false)
        return AnalyticsViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnalyticsViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}