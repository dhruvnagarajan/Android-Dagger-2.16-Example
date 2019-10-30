package com.example.daggersample.di;

import com.example.daggersample.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

/**
 * @author Dhruvaraj Nagarajan
 */
@Singleton
@Component(modules = ActivityInjector.class)
public interface AppComponent extends AndroidInjector<Application> {

    @Component.Factory
    interface Builder extends AndroidInjector.Factory<Application> {

    }
}
