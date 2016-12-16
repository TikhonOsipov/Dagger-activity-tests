package com.tixon.daggeractivitytests.dagger.components;

import com.tixon.daggeractivitytests.dagger.modules.TestScreensModule;
import com.tixon.daggeractivitytests.dagger.scopes.ActivityScope;
import com.tixon.daggeractivitytests.screens.main_activity.MainActivity;

import dagger.Subcomponent;

/**
 * Created by tikhon.osipov on 14.12.16
 */


@ActivityScope
@Subcomponent(modules = {TestScreensModule.class})
public interface ITestScreensComponent extends IScreensComponent {
    void inject(MainActivity activity);
}
