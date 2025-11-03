package com.example.zapisywanie_stanu_aplikacji_11

import android.content.Context

val Context.dataStore by preferencesDataStore

data class DataStoreManager(val context: Context) {

}
