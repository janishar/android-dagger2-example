package com.mindorks.example.android_dagger2_example.di.component;

import com.mindorks.example.android_dagger2_example.MainActivity;
import com.mindorks.example.android_dagger2_example.di.module.ActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by idee on 9/11/17.
 */

@Module
public abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = ActivityModule.class)
    abstract MainActivity mainActivity();
}

