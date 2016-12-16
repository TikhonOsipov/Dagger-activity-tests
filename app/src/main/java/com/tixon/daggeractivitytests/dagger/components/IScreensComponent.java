package com.tixon.daggeractivitytests.dagger.components;

import com.tixon.daggeractivitytests.dagger.modules.ScreensModule;
import com.tixon.daggeractivitytests.dagger.scopes.ActivityScope;
import com.tixon.daggeractivitytests.screens.main_activity.MainActivity;

import dagger.Subcomponent;

/**
 * Created by tikhon.osipov on 13.12.16
 */

@ActivityScope
@Subcomponent(modules = {ScreensModule.class})
public interface IScreensComponent {
    void inject(MainActivity activity);
}
