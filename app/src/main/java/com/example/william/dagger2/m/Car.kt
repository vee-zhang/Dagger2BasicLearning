package com.example.william.dagger2.m

import android.util.Log
import com.example.william.dagger2.Constant
import javax.inject.Inject

class Car @Inject constructor() : MachineAPI {

    var name = "小奥拓"

    override fun run(result:String) {
        Log.d(Constant.TAG, "$result,我的${name}跑向地平线！")
    }
}