package com.example.retrofittest.model.cashless


import com.google.gson.annotations.SerializedName

data class CashlessModelItem(
    @SerializedName("base_ccy")
    val baseCcy: String,
    @SerializedName("buy")
    val buy: String,
    @SerializedName("ccy")
    val ccy: String,
    @SerializedName("sale")
    val sale: String
)