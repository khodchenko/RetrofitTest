package com.example.retrofittest.data.repository

import com.example.retrofittest.data.api.RetrofitInstance
import com.example.retrofittest.model.cash.CashModel
import com.example.retrofittest.model.cashless.CashlessModel
import retrofit2.Response

class Repository {
    suspend fun getCash(): Response<CashModel>{
        return RetrofitInstance.api.getCash()
    }

    suspend fun getCashless(): Response<CashlessModel>{
        return RetrofitInstance.api.getCashless()
    }
}