package com.example.william.dagger2.v

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import com.example.william.dagger2.*
import com.example.william.dagger2.di.component.DaggerMainActivityComponent
import com.example.william.dagger2.di.module.EngineModule
import com.example.william.dagger2.m.Bike
import com.example.william.dagger2.m.Car
import com.example.william.dagger2.m.Engine
import com.example.william.dagger2.m.MachineAPI
import javax.inject.Inject
import javax.inject.Named

class MainActivity : BaseActivity() {

    @Inject
    lateinit var mContext: Context

    @Inject
    lateinit var mActivity: Activity

    @Inject
    @field:[Named("Car")]
    lateinit var mCar: MachineAPI

    @Inject
    @field:[Named("Bike")]
    lateinit var mBike: MachineAPI

    @Inject
    lateinit var mEngine: Engine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainActivityComponent
            .builder()
            .activityComponent(this.mActivityComponent)
            .build()
            .addSub(EngineModule())
            .inject(this)
    }

    fun run(v: View) {
        this.mBike.run(mEngine.start())
        this.mCar.run(mEngine.start())
    }
}
