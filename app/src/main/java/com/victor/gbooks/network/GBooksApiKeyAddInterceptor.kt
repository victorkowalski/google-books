package com.victor.gbooks.network

import com.victor.gbooks.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class GBooksApiKeyAddInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val url = chain.request().url().newBuilder()
                .addQueryParameter("key", BuildConfig.GBOOKS_API_KEY)
                .build()

        val request = chain.request().newBuilder()
                .url(url)
                .build()

        return chain.proceed(request)
    }
}