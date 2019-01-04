package com.example.william.dagger2.di.module

import com.example.william.dagger2.di.component.MainActivityScope
import com.example.william.dagger2.m.Bike
import com.example.william.dagger2.m.Car
import com.example.william.dagger2.m.MachineAPI
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MachineModule {

//    @Provides
//    fun provideCar() = Car() as MachineAPI


    @Named("Car")
    @Provides
    @MainActivityScope
    fun provideCar(machine: Car): MachineAPI = machine

    @Named("Bike")
    @Provides
    @MainActivityScope
    fun provideBike(machine: Bike): MachineAPI = machine
}