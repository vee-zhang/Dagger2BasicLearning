package com.example.william.dagger2.di.component

import android.app.Activity
import android.content.Context
import com.example.william.dagger2.di.module.EngineModule
import com.example.william.dagger2.di.module.MachineModule
import com.example.william.dagger2.v.MainActivity
import dagger.Component
import javax.inject.Scope

@MainActivityScope
@Component(dependencies = [ActivityComponent::class], modules = [MachineModule::class])
interface MainActivityComponent {

    fun inject(activity: MainActivity)

    fun activity(): Activity

    fun context(): Context

    /**
     * 注意传入Module返回Component
     */
    fun addSub(engineModule: EngineModule): EngineComponent
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class MainActivityScope