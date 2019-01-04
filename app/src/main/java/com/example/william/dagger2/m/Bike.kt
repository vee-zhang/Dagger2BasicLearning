package com.example.william.dagger2.m

import android.util.Log
import com.example.william.dagger2.Constant
import javax.inject.Inject

class Bike @Inject constructor() : MachineAPI {

    val name = "江铃"

    override fun run(engineResult: String) {
        Log.d(Constant.TAG, "$engineResult,我的${name}摩托奔向天际线！")
    }
}