package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import com.example.exam.ApiService
import com.example.exam.News
import com.example.exam.Country
import com.example.exam.Category
import kotlinx.android.synthetic.main.fragment_todolist.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://saurav.tech/NewsAPI/top-headlines/category/{category}/{country}.json")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

        apiService = retrofit.create(ApiService::class.java)
        news = mutableListOf()


    }

    override fun onSupportNavigateUp(): Boolean = findNavController(R.id.nav_host_fragment).navigateUp()

    companion object {
        lateinit var news: MutableList<News>
        lateinit var instance: MainActivity
        lateinit var apiService: ApiService
        fun creatNews(comment: News) {
        }

    }

}