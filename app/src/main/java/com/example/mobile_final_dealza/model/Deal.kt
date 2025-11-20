package com.example.mobile_final_dealza.model

import java.util.Date

data class Deal (
    val dealTitle: String,
    val id: Int,
    val pizzaBrand: String,
    val expirationDate: Date,
    val startDate: Date,
    val creationDate: Date,
    val description: String,
    val priceRange: String,
    val numberOfTopping: Int,
    val countOfFavourited: Int,
    val location: String
)