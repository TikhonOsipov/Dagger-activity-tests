package com.tixon.daggeractivitytests;

import android.app.Application;

import com.tixon.daggeractivitytests.app.IApp;
import com.tixon.daggeractivitytests.dagger.components.DaggerITestAppComponent;
import com.tixon.daggeractivitytests.dagger.components.IAppComponent;
import com.tixon.daggeractivitytests.dagger.components.IScreensComponent;
import com.tixon.daggeractivitytests.dagger.components.ITestAppComponent;
import com.tixon.daggeractivitytests.dagger.components.ITestScreensComponent;
import com.tixon.daggeractivitytests.dagger.modules.TestAppModule;
import com.tixon.daggeractivitytests.dagger.modules.TestScreensModule;
import com.tixon.daggeractivitytests.screens.main_activity.IMainView;

/**
 * Created by tikhon.osipov on 14.12.16
 */

public class TestApp extends Application implements IApp {
    private IAppComponent appComponent;
    private ITestScreensComponent testScreensComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerITestAppComponent.builder()
                .testAppModule(new TestAppModule(this))
                .build();
    }

    @Override
    public IAppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public IScreensComponent plusScreensComponent(IMainView view) {
        if(testScreensComponent == null) {
            testScreensComponent = ((ITestAppComponent) appComponent)
                    .plus(new TestScreensModule(view));
        }
        return testScreensComponent;
    }
}
