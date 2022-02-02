package com.example.retrofittest.model.cash


import com.google.gson.annotations.SerializedName

data class CashModelItem(
    @SerializedName("base_ccy")
    val baseCcy: String,
    @SerializedName("buy")
    val buy: String,
    @SerializedName("ccy")
    val ccy: String,
    @SerializedName("sale")
    val sale: String
)