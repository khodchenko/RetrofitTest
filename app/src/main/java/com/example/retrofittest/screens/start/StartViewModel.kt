package com.example.retrofittest.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofittest.data.repository.Repository
import com.example.retrofittest.model.cash.CashModel
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel(){

    var repository = Repository()
    val myMoneyList: MutableLiveData<Response<CashModel>> = MutableLiveData()


    fun getCashMoney(){
        viewModelScope.launch {
            myMoneyList.value = repository.getCash()
        }
    }
}