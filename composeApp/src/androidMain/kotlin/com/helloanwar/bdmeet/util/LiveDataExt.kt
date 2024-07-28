package com.helloanwar.bdmeet.util

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

fun <T> MutableLiveData<T>.hide(): LiveData<T> = this