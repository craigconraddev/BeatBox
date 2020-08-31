package com.bignerdranch.android.beatbox

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData

private const val TAG = "SoundViewModel"

class SoundViewModel {

    val title: MutableLiveData<String?> = MutableLiveData()

    var sound: Sound? = null
            set(sound) {
                field = sound
               title.postValue(sound?.name)
            }

    fun onButtonClick() {
        Log.d(TAG, "Clicked ${sound?.name}")
    }
}