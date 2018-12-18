package com.example.myk.koinstarterproject.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myk.koinstarterproject.R
import org.koin.android.ext.android.inject
import timber.log.Timber

class MainActivity : AppCompatActivity(), MainContract.View {
    override val presenter: MainContract.Presenter by inject()

    override fun testView() {
        Timber.w("View!")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        // subscribe to presenter
        presenter.subscribe(this)

        presenter.testPresenter()
    }

    override fun onStop() {
        // unsubscribe to presenter when view will go away
        presenter.unSubscribe()

        super.onStop()
    }
}
