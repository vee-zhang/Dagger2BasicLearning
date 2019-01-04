package com.example.william.dagger2.di.component

import android.content.Context
import com.example.william.dagger2.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton//如果用dependencies就不能用Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun context(): Context
}