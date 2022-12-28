package com.example.booktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.booktest.model.BookResponse
import com.example.booktest.model.remote.Network
import com.example.booktest.view.Comunicator
import com.example.booktest.view.DisplayFragment
import com.example.booktest.view.SearchFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(), Comunicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_search, SearchFragment())
            .commit()

    }



    override fun sendDataToSearch(bookTitle: String,
                                  bookFilter: String,
                                  bookType: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_display, DisplayFragment
                .newInstance(bookTitle, bookFilter, bookType))
            .addToBackStack(null)
            .commit()
    }
}