package com.di.myapplication.di;

import com.di.myapplication.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String simpleInjectedString(){
        return "Hi, I am simple injected string";
    }

}
