package com.example.william.dagger2.v

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.william.dagger2.App
import com.example.william.dagger2.di.component.ActivityComponent
import com.example.william.dagger2.di.component.DaggerActivityComponent
import com.example.william.dagger2.di.module.ActivityModule

open class BaseActivity : AppCompatActivity() {

    lateinit var mActivityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initActivityInject()
    }

    fun initActivityInject() {
        mActivityComponent = DaggerActivityComponent.builder()
            .appComponent((application as App).mAppComponent)
            .activityModule(ActivityModule(this))
            .build()
    }
}