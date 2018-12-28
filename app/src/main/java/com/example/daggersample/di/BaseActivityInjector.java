package com.example.daggersample.di;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import dagger.Binds;
import dagger.Module;

/**
 * @author Dhruvaraj Nagarajan
 */
@Module
public abstract class BaseActivityInjector {

    @Binds
    abstract Context provideContext(AppCompatActivity activity);
}
