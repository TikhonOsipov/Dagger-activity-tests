package com.tixon.daggeractivitytests.dagger.components;

import com.tixon.daggeractivitytests.dagger.modules.TestAppModule;
import com.tixon.daggeractivitytests.dagger.modules.TestScreensModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tikhon.osipov on 14.12.16
 */

@Singleton
@Component(modules = {TestAppModule.class})
public interface ITestAppComponent extends IAppComponent {
    ITestScreensComponent plus(TestScreensModule testScreensModule);
}
