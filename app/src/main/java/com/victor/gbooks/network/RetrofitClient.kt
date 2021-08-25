package com.victor.gbooks.network

import com.google.gson.GsonBuilder
import com.victor.gbooks.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.internal.platform.Platform
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors

object RetrofitClient {

    private var retrofit: Retrofit? = null
    private val gson = GsonBuilder().setLenient().create()

    val client: Retrofit
        get() {
            if (retrofit == null) {
                synchronized(Retrofit::class.java) {
                    if (retrofit == null) {

                        val httpClient = OkHttpClient.Builder()
                                .addInterceptor(GBooksApiKeyAddInterceptor())

                        if (BuildConfig.DEBUG) {
                            val logging = HttpLoggingInterceptor()
                            logging.level = HttpLoggingInterceptor.Level.BODY

                            httpClient.addInterceptor(logging)
                        }

                        retrofit = Retrofit.Builder()
                                .baseUrl(BuildConfig.API_BASE_URL)
                                .addConverterFactory(GsonConverterFactory.create(gson))
                                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                                .client(httpClient.build())
                                .build()
                    }
                }

            }
            return retrofit!!
        }
}