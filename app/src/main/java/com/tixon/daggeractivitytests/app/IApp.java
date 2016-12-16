package com.tixon.daggeractivitytests.app;

import com.tixon.daggeractivitytests.dagger.components.IAppComponent;
import com.tixon.daggeractivitytests.dagger.components.IScreensComponent;
import com.tixon.daggeractivitytests.screens.main_activity.IMainView;

/**
 * Created by tikhon.osipov on 13.12.16
 */

public interface IApp {
    IAppComponent getAppComponent();
    IScreensComponent plusScreensComponent(IMainView view);
}
