package com.example.william.dagger2.di.component

import android.app.Activity
import android.content.Context
import com.example.william.dagger2.di.module.ActivityModule
import dagger.Component
import javax.inject.Scope
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun context(): Context

    fun activity(): Activity
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope