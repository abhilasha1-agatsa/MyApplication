package com.s.myapplication.di.module

import com.s.myapplication.ui.auth.AuthActivity
import com.s.myapplication.ui.auth.AuthFragmentBindingModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [(AuthFragmentBindingModule::class)])
    abstract fun bindLoginSignupActivity(): AuthActivity
}