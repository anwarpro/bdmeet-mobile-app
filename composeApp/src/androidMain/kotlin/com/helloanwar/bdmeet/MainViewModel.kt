package com.helloanwar.bdmeet

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.preference.PreferenceManager
import androidx.core.content.edit

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val preferences = PreferenceManager.getDefaultSharedPreferences(application)

    fun getSavedUrl() = preferences.getString(PREFERENCES_KEY_URL, URL) as String
    fun getSavedToken() = preferences.getString(PREFERENCES_KEY_TOKEN, TOKEN) as String
    fun getE2EEOptionsOn() = preferences.getBoolean(PREFERENCES_KEY_E2EE_ON, false)
    fun getSavedE2EEKey() = preferences.getString(PREFERENCES_KEY_E2EE_KEY, E2EE_KEY) as String

    fun setSavedUrl(url: String) {
        preferences.edit {
            putString(PREFERENCES_KEY_URL, url)
        }
    }

    fun setSavedToken(token: String) {
        preferences.edit {
            putString(PREFERENCES_KEY_TOKEN, token)
        }
    }

    fun setSavedE2EEOn(yesno: Boolean) {
        preferences.edit {
            putBoolean(PREFERENCES_KEY_E2EE_ON, yesno)
        }
    }

    fun setSavedE2EEKey(key: String) {
        preferences.edit {
            putString(PREFERENCES_KEY_E2EE_KEY, key)
        }
    }

    fun reset() {
        preferences.edit { clear() }
    }

    companion object {
        private const val PREFERENCES_KEY_URL = "url"
        private const val PREFERENCES_KEY_TOKEN = "token"
        private const val PREFERENCES_KEY_E2EE_ON = "enable_e2ee"
        private const val PREFERENCES_KEY_E2EE_KEY = "e2ee_key"

        const val URL = "wss://livekit.helloanwar.com"
        const val TOKEN = ""
        const val E2EE_KEY = "12345678"
    }
}