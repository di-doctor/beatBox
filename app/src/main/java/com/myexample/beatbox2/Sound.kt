package com.myexample.beatbox2

private const val WAV = ".wav"
class Sound(val assetPath: String, var soundId: Int? = null) {
    val name: String = assetPath.split("/").last().removeSuffix(WAV)

}