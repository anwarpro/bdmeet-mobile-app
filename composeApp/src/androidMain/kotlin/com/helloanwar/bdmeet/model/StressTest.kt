package com.helloanwar.bdmeet.model

sealed class StressTest {

    data class SwitchRoom(
        val firstToken: String,
        val secondToken: String,
    ) : StressTest()

    data object None : StressTest()
}