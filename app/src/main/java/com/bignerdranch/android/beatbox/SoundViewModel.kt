package com.bignerdranch.android.beatbox

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData

private const val TAG = "SoundViewModel"

class SoundViewModel(private val beatBox: BeatBox): BaseObservable() {

    var sound: Sound? = null
            set(sound) {
                field = sound
                notifyChange()
            }

    @get:Bindable
    val title: String?
        get() = sound?.name

    fun onButtonClicked() {
       // Log.d(TAG, "Clicked ${sound?.name}")
        sound?.let {
            beatBox.play(it)
        }
    }
}