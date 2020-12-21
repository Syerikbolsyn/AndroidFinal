package com.example.exam

import androidx.room.Query
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("posts/")
    fun getNews(): Call<List<News>>

    @GET("posts/{id}/")
    fun getTodoById(@Path("id") postInt: Int): Call<Category>
    //https://saurav.tech/NewsAPI/top-headlines/category/{category}/{country}.json
    @Headers("Cache-Control: max-age=640000", "User-Agent: My-App-Name")
    @GET("comments/")
    fun getComentsByUserId(
        @Query("userId") userId: Int): Call<List<Country>>

    @GET("news/")
    fun getComments(): Call<List<Country>>
}