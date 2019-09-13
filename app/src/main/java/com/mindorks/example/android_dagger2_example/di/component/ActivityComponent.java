package com.mindorks.example.android_dagger2_example.di.component;

import com.mindorks.example.android_dagger2_example.MainActivity;
import com.mindorks.example.android_dagger2_example.di.PerActivity;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule;

import dagger.Component;

/**
 * Created by janisharali on 08/12/16.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ApplicationModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
