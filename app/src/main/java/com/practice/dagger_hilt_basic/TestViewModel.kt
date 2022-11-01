package com.practice.dagger_hilt_basic

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(

    // Meng-inject tidak perlu lagi menggunakan @Inject karena
    // sudah ada di constructor.

    // Memanggil object string1 yang di-inject dari AppModule
    testString1: String,

    // Memanggil object string2 yang di-inject dari AppModule
    @Named("string2") testString2: String,

    // Memanggil object string3 yang di-inject dari MainModule
    @Named("string3") testString3: String
): ViewModel() {
    init {
        Log.d("VIEWMODEL TAG1", "Test String from  ViewModel:$testString1")
        Log.d("VIEWMODEL TAG2", "Test String from  ViewModel:$testString2")
        Log.d("VIEWMODEL TAG3", "Test String from  ViewModel:$testString3")
    }

}