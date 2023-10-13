package com.mindorks.example.android_dagger2_example.di.component;

import android.app.Application;

import com.mindorks.example.android_dagger2_example.DemoApplication;
import com.mindorks.example.android_dagger2_example.di.module.ActivityModule;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


/**
 * Created by janisharali on 08/12/16.
 */

@Singleton
@Component(modules = {ActivityBindingModule.class, ApplicationModule.class, AndroidSupportInjectionModule.class})
public interface ApplicationComponent extends AndroidInjector<DemoApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        ApplicationComponent.Builder application(Application application);
        ApplicationComponent build();
    }

    @Override
    void inject(DemoApplication demoApplication);

}
