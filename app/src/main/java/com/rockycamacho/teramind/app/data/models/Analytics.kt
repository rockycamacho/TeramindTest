package com.rockycamacho.teramind.app.data.models

data class Analytics(
    var id: String? = null,
    var type: AnalyticsType? = null,
    var value: String? = null,
    var metric: String? = null
)