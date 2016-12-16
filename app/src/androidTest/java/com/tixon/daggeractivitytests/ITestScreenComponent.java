package com.tixon.daggeractivitytests;

import com.tixon.daggeractivitytests.dagger.components.IScreensComponent;
import com.tixon.daggeractivitytests.dagger.scopes.ActivityScope;
import com.tixon.daggeractivitytests.screens.main_activity.MainActivity;

import dagger.Subcomponent;

/**
 * Created by tikhon.osipov on 13.12.16
 */

@ActivityScope
@Subcomponent(modules = {TestScreensModule.class})
public interface ITestScreenComponent extends IScreensComponent {
    void inject(MainActivity activity);
}
