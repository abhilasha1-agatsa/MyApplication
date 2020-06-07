package com.s.myapplication.ui.auth

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
public abstract class AuthFragmentBindingModule {
    @ContributesAndroidInjector
    abstract fun provideLoginFragment():LoginFragment

}