package com.example.booktest.model.remote


import com.example.booktest.model.BookResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {
    //steps

    @GET(ENDPOINT)
    fun getNextBookPage(
        @Query(PARAM_Q) bookTitle: String,
        @Query(PARAM_PRINT_TYPE) bookType: String,
        @Query(PARAM_FILTER) bookFilter: String,
        @Query(PARAM_START_INDEX) pageIndex: Int
    ): Call<BookResponse>

}