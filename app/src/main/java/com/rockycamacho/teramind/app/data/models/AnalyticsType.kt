package com.rockycamacho.teramind.app.data.models

sealed class AnalyticsType {

    object ALERTS_TRIGGERED: AnalyticsType()
    object PRODUCTIVITY: AnalyticsType()
    object HOURS_WORKED: AnalyticsType()

}
