package com.victor.gbooks.network

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    //https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&key=bm8u5dsMhJXuSTEGied0
/*
        private const val BASE_API_URL = "https://www.googleapis.com/books/v1/volumes"
        private const val QUERY_PARAMETER_KEY = "q"
        private const val KEY = "key"
        private const val API_KEY = "AIzaSyDV87G8uwwe3Tubm8u5dsMhJXuSTEGied0"
        private const val TITLE = "intitle:"
        private const val AUTHOR = "inauthor:"
        private const val PUBLISHER = "inpublisher:"
        private const val ISBN = "isbn:"
*/
    @GET("./")
    fun searchBook(@Query("q") q: String): Observable<ResponseBody>
}