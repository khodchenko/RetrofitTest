package com.example.retrofittest.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofittest.data.repository.Repository
import com.example.retrofittest.model.cashless.CashlessModel
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {
    var repository = Repository()
    val myMoneyList: MutableLiveData<Response<CashlessModel>> = MutableLiveData()


    fun getCashlessMoney(){
        viewModelScope.launch {
            myMoneyList.value = repository.getCashless()
        }
    }
}
