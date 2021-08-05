package com.health.retrofitexample


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Joke(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("punchline")
    val punchline: String?,
    @SerializedName("setup")
    val setup: String?,
    @SerializedName("type")
    val type: String?
)