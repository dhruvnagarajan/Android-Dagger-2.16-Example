package com.example.daggersample.di;

import com.example.daggersample.App;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

/**
 * @author Dhruvaraj Nagarajan
 */
@Singleton
@Component(modules = ActivityInjector.class)
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }
}
