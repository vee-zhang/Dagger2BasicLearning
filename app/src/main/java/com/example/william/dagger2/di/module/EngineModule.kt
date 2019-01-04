package com.example.william.dagger2.di.module

import com.example.william.dagger2.m.Engine
import dagger.Module
import dagger.Provides

@Module
class EngineModule {

    @Provides
    fun provideEngine() = Engine()
}