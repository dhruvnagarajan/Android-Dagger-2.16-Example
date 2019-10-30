package com.example.daggersample;

import com.example.daggersample.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * @author Dhruvaraj Nagarajan
 */
public class Application extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.factory().create(this);
    }
}
