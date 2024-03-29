package com.myexample.beatbox2

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel(private val beatBox: BeatBox): BaseObservable() {

    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }

    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyPropertyChanged(BR.title)  //notifyChange() все обновить
        }

    @get:Bindable
    val title: String?
        get() {
            return sound?.name
        }
}