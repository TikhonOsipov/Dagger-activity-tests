package com.tixon.daggeractivitytests.app;

import android.app.Application;
import android.content.Context;

import com.tixon.daggeractivitytests.dagger.components.AppComponent;
import com.tixon.daggeractivitytests.dagger.components.DaggerAppComponent;
import com.tixon.daggeractivitytests.dagger.components.IAppComponent;
import com.tixon.daggeractivitytests.dagger.components.IScreensComponent;
import com.tixon.daggeractivitytests.dagger.modules.AppModule;
import com.tixon.daggeractivitytests.dagger.modules.ScreensModule;
import com.tixon.daggeractivitytests.screens.main_activity.IMainView;

/**
 * Created by tikhon.osipov on 13.12.16
 */

public class App extends Application implements IApp {
    private IAppComponent appComponent;
    private IScreensComponent screensComponent;

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @Override
    public IScreensComponent plusScreensComponent(IMainView view) {
        if(screensComponent == null) {
            ((AppComponent) appComponent).plus(new ScreensModule(view));
        }
        return screensComponent;
    }


    @Override
    public IAppComponent getAppComponent() {
        return appComponent;
    }
}
