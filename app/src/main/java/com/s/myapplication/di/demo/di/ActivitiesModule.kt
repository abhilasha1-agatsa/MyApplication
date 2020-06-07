package com.s.myapplication.di.demo.di

import com.s.myapplication.ui.auth.AuthActivity
import com.s.myapplication.ui.auth.AuthActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector(modules = [(AuthActivityModule::class)])
    abstract fun authActivityAndroidInjector(): AuthActivity
}