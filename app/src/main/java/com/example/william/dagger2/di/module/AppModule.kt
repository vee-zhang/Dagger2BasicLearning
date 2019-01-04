package com.example.william.dagger2.di.module

import android.content.Context
import com.example.william.dagger2.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val context: App) {

    @Singleton
    @Provides
    fun provideContext() = this.context as Context
}