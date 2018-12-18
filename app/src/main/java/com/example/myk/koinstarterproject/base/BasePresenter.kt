package com.example.myk.koinstarterproject.base

interface BasePresenter<V> {

    var view: V?

    fun subscribe(view: V)

    fun unSubscribe()
}