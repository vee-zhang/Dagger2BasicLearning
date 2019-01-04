package com.example.william.dagger2

import android.app.Application
import com.example.william.dagger2.di.component.AppComponent
import com.example.william.dagger2.di.component.DaggerAppComponent
import com.example.william.dagger2.di.module.AppModule

class App : Application() {

    lateinit var mAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppInjection()
    }

    private fun initAppInjection() {
        mAppComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}