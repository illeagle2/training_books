package com.example.booktest.view

interface Comunicator {

    fun sendDataToSearch(bookTitle: String, bookFilter: String, bookType: String)

}