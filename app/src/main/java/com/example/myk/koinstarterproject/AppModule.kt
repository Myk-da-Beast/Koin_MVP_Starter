package com.example.myk.koinstarterproject

import com.example.myk.koinstarterproject.dependencyInjection.Test.TestDependency
import com.example.myk.koinstarterproject.dependencyInjection.Test.TestDependencyImpl
import com.example.myk.koinstarterproject.main.MainContract
import com.example.myk.koinstarterproject.main.MainPresenter
import org.koin.dsl.module.module

val appModule = module {
    // Presenter for Main View
    factory<MainContract.Presenter> { MainPresenter(get()) }

    // Singleton dependency
    single<TestDependency>(createOnStart = true) { TestDependencyImpl() }
}