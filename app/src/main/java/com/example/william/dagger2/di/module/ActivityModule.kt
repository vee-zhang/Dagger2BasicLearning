package com.example.william.dagger2.di.module

import android.app.Activity
import com.example.william.dagger2.di.component.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    @ActivityScope
    fun activity() = this.activity
}