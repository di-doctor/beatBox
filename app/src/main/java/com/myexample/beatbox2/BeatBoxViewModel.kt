package com.myexample.beatbox2

import android.content.res.AssetManager
import androidx.lifecycle.ViewModel

class BeatBoxViewModel() : ViewModel() {
    companion object
    {
        lateinit var  beatBox :BeatBox
    }
    fun getBeatBox() = beatBox

    fun setupDependencies(assets: AssetManager) {
        beatBox = BeatBox(assets)
    }

    override fun onCleared() {
        super.onCleared()
        beatBox.release()
    }
}