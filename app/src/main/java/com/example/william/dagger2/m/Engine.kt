package com.example.william.dagger2.m

import javax.inject.Inject

class Engine @Inject constructor() {

    var name = "抖动小三缸"

    //    fun start() {
//        Log.d(Constant.TAG, "${name}引擎已启动")
//    }
    fun start() = "${name}引擎已启动"
}