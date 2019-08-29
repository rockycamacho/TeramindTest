package com.rockycamacho.teramind.app.data.models

import org.threeten.bp.LocalDateTime


data class UserActivity(
    var id: String? = null,
    var name: String? = null,
    var type: ActivityType? = null,
    var timestamp: LocalDateTime? = null
)