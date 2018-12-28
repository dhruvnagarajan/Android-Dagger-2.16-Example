package com.example.daggersample.di;

import com.example.daggersample.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Dhruvaraj Nagarajan
 */
@Module(includes = AndroidSupportInjectionModule.class)
public abstract class ActivityInjector {

    @ContributesAndroidInjector(modules = BaseActivityInjector.class)
    abstract MainActivity provideMainActivity();
}
