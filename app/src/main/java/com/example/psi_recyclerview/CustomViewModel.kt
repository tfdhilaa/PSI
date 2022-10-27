package com.example.psi_recyclerview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CustomViewModel : ViewModel() {
    val listData = MutableLiveData<MutableList<ItemsViewModel>>()
    var Data = mutableListOf<ItemsViewModel>()

    fun setData(itemsViewModel: ItemsViewModel){
        Data.add(itemsViewModel)
        listData.postValue(Data)
    }
    fun getData(): LiveData<MutableList<ItemsViewModel>> {
        return listData
    }
}