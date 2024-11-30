package com.example.project1.data.controller

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project1.data.model.ServiceModel
import com.example.project1.data.network.RetrofitClient
import kotlinx.coroutines.launch
import retrofit2.Response // Cambiado a retrofit2.Response

class ServiceViewModel : ViewModel() {
    val api = RetrofitClient.api

    fun getServices(onResult: (Response<List<ServiceModel>>) -> Unit) {
        viewModelScope.launch {
            try {
                val response = api.getServices() // Llama a la API de Retrofit
                onResult(response)
            } catch (exception: Exception) {
                print(exception)
            }
        }
    }

    fun showServices(id: Int, onResult: (Response<ServiceModel>) -> Unit) {
        viewModelScope.launch {
            try {
                val response = api.getService(id) // Llama a la API de Retrofit
                onResult(response)
            } catch (exception: Exception) {
                print(exception)
            }
        }
    }

    fun createService(service: ServiceModel, onResult: (Response<ServiceModel>) -> Unit) {
        viewModelScope.launch {
            try {
                val response = api.createService(service) // Llama a la API de Retrofit
                onResult(response)
            } catch (exception: Exception) {
                print(exception)
            }
        }
    }

    fun updateService(id: Int, service: ServiceModel, onResult: (Response<ServiceModel>) -> Unit) {
        viewModelScope.launch {
            try {
                val response = api.updateService(id, service) // Llama a la API de Retrofit
                onResult(response)
            } catch (exception: Exception) {
                print(exception)
            }
        }
    }

    fun deleteService(id: Int, onResult: (Response<ServiceModel>) -> Unit) {
        viewModelScope.launch {
            try {
                val response = api.deleteService(id) // Llama a la API de Retrofit
                onResult(response)
            } catch (exception: Exception) {
                print(exception)
            }
        }
    }
}