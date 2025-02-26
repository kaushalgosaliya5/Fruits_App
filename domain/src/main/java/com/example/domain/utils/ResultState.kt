package com.example.domain.utils

sealed  class ResultState<T>(val data:T?=null, val message:String?=null){

    class Success<T>(data:T?): ResultState<T>(data = data)

    class Loading<T>(message: String?) : ResultState<T>()

    class Error<T>(message:String?) : ResultState<T>(message= message)

}