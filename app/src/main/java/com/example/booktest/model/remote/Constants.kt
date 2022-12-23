package com.example.booktest.model.remote

//https://www.googleapis.com/books/v1/volumes?q=bible&printType=books&filter=ebooks

const val BASE_URL = "https://www.googleapis.com/"
const val ENDPOINT = "books/v1/volumes"
const val PARAM_Q = "q"
const val PARAM_PRINT_TYPE = "printType"
const val PARAM_FILTER = "filter"
const val PARAM_START_INDEX = "startIndex"