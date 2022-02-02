package com.example.retrofittest.data.api

import com.example.retrofittest.model.cash.CashModel
import com.example.retrofittest.model.cashless.CashlessModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCash() : Response<CashModel>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getCashless() : Response<CashlessModel>
}