package com.rockycamacho.teramind.app.presentation.analytics

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.rockycamacho.teramind.app.R
import com.rockycamacho.teramind.app.data.models.Analytics
import com.rockycamacho.teramind.app.data.models.AnalyticsType
import kotlinx.android.synthetic.main.item_analytics.view.*

class AnalyticsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: Analytics) {
        val activityTypeImage = getAnalyticsImage(item)
        itemView.image.setImageResource(activityTypeImage)
        itemView.metric.text = item.metric
        itemView.value.text = item.value
    }

    private fun getAnalyticsImage(item: Analytics): Int {
        return when (item.type) {
            AnalyticsType.ALERTS_TRIGGERED -> R.drawable.ic_add_alert_black_24dp
            AnalyticsType.HOURS_WORKED -> R.drawable.ic_timelapse_black_24dp
            AnalyticsType.PRODUCTIVITY -> R.drawable.ic_format_list_bulleted_black_24dp
            else -> R.drawable.ic_format_list_bulleted_black_24dp
        }
    }

}
