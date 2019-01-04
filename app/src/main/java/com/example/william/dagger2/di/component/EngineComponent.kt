package com.example.william.dagger2.di.component

import com.example.william.dagger2.di.module.EngineModule
import com.example.william.dagger2.v.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [EngineModule::class])
interface EngineComponent {

    fun inject(activity: MainActivity)
}