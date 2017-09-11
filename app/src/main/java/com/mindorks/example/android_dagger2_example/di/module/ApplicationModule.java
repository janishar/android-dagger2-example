package com.mindorks.example.android_dagger2_example.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.mindorks.example.android_dagger2_example.di.ApplicationContext;
import com.mindorks.example.android_dagger2_example.di.DatabaseInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by janisharali on 25/12/16.
 */

@Module
public class ApplicationModule {

    @ApplicationContext
    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application.getApplicationContext();
    }

    @Provides
    static SharedPreferences provideSharedPrefs(Application application) {
        return application.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }


    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 2;
    }


}
