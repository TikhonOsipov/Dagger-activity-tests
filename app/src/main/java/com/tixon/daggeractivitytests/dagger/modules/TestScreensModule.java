package com.tixon.daggeractivitytests.dagger.modules;

import com.tixon.daggeractivitytests.dagger.scopes.ActivityScope;
import com.tixon.daggeractivitytests.screens.main_activity.IMainPresenter;
import com.tixon.daggeractivitytests.screens.main_activity.IMainView;
import com.tixon.daggeractivitytests.screens.main_activity.TestMainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon.osipov on 14.12.16
 */

@Module
public class TestScreensModule {
    private IMainView mainView;

    public TestScreensModule(IMainView mainView) {
        this.mainView = mainView;
    }

    @Provides
    @ActivityScope
    public IMainView provideMainView() {
        return mainView;
    }

    @Provides
    @ActivityScope
    public IMainPresenter provideTestMainPresenter(TestMainPresenter presenter) {
        return presenter;
    }
}
