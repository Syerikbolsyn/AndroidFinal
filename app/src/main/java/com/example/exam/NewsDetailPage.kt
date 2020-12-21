package com.example.exam
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.ApiService
import com.example.myapplication.Comments
import com.example.myapplication.User
import kotlinx.android.synthetic.main.fragment_detail.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsDetailPage  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsId = arguments?.getInt("newsId")!!
        val userId = arguments?.getInt("userId")!!

        MainActivity.apiService.getNewsById(newsId).enqueue(object : Callback<News> {
            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.e("error", t.message.toString())
            }

            override fun onResponse(call: Call<News>, response: Response<News>) {
                Log.e("Response body: ", response.body()!!.toString())
                val comment = response.body()!!
                val detail_title.text = news.title
                val detail_completed_checkbox.isChecked = news.completed

            }
        })


    }
}