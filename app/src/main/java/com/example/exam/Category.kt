package com.example.exam

import com.google.gson.annotations.SerializedName

data class Category (
    @SerializedName("postId")
    val postId: Int,
    @SerializedName("name")
    val name : String ,
    @SerializedName("body")
    val body: String,
)