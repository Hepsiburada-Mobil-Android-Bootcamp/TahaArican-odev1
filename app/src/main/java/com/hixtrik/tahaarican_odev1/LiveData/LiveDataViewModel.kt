package com.hixtrik.tahaarican_odev1.LiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

//┌──────────────────────────┐
//│ Created by Taha ARICAN   │
//│ aricantaha06@gmail.com   │            
//│ 14.10.2021               │
//└──────────────────────────┘
class LiveDataViewModel : ViewModel() {

    val textLiveData: MutableLiveData<String> by lazy() {
        MutableLiveData<String>()
    }

    fun setText(txt : String) {

        textLiveData.value = txt
    }


}