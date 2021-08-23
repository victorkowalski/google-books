package com.victor.gbooks.data.model

data class ResponseBody(
    val items: List<Item>,
    val kind: String,
    val totalItems: Int
)