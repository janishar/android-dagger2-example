package com.mindorks.example.android_dagger2_example.di.module;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.mindorks.example.android_dagger2_example.MainActivity;
import com.mindorks.example.android_dagger2_example.di.ActivityContext;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by janisharali on 08/12/16.
 */

@Module
public abstract class ActivityModule {

    @Binds
    @ActivityContext
    abstract Activity provideActivity(MainActivity activity);

}
