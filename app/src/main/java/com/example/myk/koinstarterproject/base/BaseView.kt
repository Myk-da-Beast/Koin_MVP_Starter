package com.example.myk.koinstarterproject.base

interface BaseView<out P : BasePresenter<*>> {

    val presenter: P
}