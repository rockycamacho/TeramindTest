package com.rockycamacho.teramind.app.data.models

sealed class ActivityType {

    object EMAIL: ActivityType()
    object IDLE: ActivityType()
    object GAME: ActivityType()

}
