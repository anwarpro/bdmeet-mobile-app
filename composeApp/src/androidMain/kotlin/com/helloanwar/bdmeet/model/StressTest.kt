package com.helloanwar.bdmeet.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed class StressTest : Parcelable {

    @Parcelize
    data class SwitchRoom(
        val firstToken: String,
        val secondToken: String,
    ) : StressTest()

    @Parcelize
    data object None : StressTest()
}