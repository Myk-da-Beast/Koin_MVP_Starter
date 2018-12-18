package com.example.myk.koinstarterproject.main

import android.util.Log
import com.example.myk.koinstarterproject.dependencyInjection.Test.TestDependency
import timber.log.Timber

class MainPresenter(private val testDependency: TestDependency) : MainContract.Presenter {

    override var view : MainContract.View? = null

    override fun subscribe(v: MainContract.View) {
        view = v
    }

    override fun unSubscribe() {
        view = null
    }

    override fun testPresenter() {
        Timber.w("Presenter!")
        Timber.w(testDependency.test())
        view?.testView()
    }
}