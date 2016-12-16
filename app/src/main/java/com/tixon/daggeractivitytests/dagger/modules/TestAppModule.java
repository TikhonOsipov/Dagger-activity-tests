package com.tixon.daggeractivitytests.dagger.modules;

import com.tixon.daggeractivitytests.app.IApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon.osipov on 14.12.16
 */

@Module
public class TestAppModule {
    private IApp application;

    public TestAppModule(IApp app) {
        this.application = app;
    }

    @Provides
    @Singleton
    public IApp provideTestApplication() {
        return application;
    }
}
