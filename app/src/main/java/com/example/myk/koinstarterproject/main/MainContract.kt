package com.example.myk.koinstarterproject.main

import com.example.myk.koinstarterproject.base.BasePresenter
import com.example.myk.koinstarterproject.base.BaseView

interface MainContract {
    interface Presenter: BasePresenter<View> {
        fun testPresenter()
    }

    interface View: BaseView<Presenter> {
        fun testView()
    }
}