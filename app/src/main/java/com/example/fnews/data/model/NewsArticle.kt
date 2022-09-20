package com.example.fnews.data.model

data class NewsArticle(
    val id: Int,
    val title: String,
    val imageResourceId: Int,
    val location: String,
    val date: String,
    val article: String
)
