package com.example.exam

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//
//class News : Fragment() {
//
//    companion object {
//        fun newInstance() = News()
//    }
//
//    private lateinit var viewModel: NewsDetailPage
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.news_fragment, container, false)
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(NewsDetailPage::class.java)
//        // TODO: Use the ViewModel
//    }
//
//}
data class News(
    val title: String,
    val id: Int,
    val name: String,
    val body: String
)