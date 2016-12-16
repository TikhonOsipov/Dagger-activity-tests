package com.tixon.daggeractivitytests.dagger.components;

import com.tixon.daggeractivitytests.dagger.modules.AppModule;
import com.tixon.daggeractivitytests.dagger.modules.ScreensModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tikhon.osipov on 14.12.16
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent extends IAppComponent {
    IScreensComponent plus(ScreensModule screensModule);
}
