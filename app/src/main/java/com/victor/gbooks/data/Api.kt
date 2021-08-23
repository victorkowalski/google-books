package com.victor.gbooks.data

import com.google.gson.GsonBuilder
import com.victor.gbooks.BuildConfig
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("./")
    fun searchBook(@Query("q") q: String): Observable<ResponseBody>

    companion object Factory {
        //apikey = AIzaSyDV87G8uwwe3Tubm8u5dsMhJXuSTEGied0
        //https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&key=AIzaSyDV87G8uwwe3Tubm8u5dsMhJXuSTEGied0

        private const val BASE_API_URL = "https://www.googleapis.com/books/v1/volumes"
        private const val QUERY_PARAMETER_KEY = "q"
        private const val KEY = "key"
        private const val API_KEY = "AIzaSyDV87G8uwwe3Tubm8u5dsMhJXuSTEGied0"
        private const val TITLE = "intitle:"
        private const val AUTHOR = "inauthor:"
        private const val PUBLISHER = "inpublisher:"
        private const val ISBN = "isbn:"

        fun create(): Api {

            val httpClient = OkHttpClient.Builder()

            if (BuildConfig.DEBUG) {
                val logging = HttpLoggingInterceptor()
                logging.level = HttpLoggingInterceptor.Level.BODY

                httpClient.addInterceptor(logging)
            }

            val gson = GsonBuilder()
                    .setLenient()
                    .create()

            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_API_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()

            return retrofit.create(Api::class.java)
        }
    }
}