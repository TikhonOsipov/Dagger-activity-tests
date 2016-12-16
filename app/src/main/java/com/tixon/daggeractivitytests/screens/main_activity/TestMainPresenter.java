package com.tixon.daggeractivitytests.screens.main_activity;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 14.12.16
 */

public class TestMainPresenter implements IMainPresenter {
    private IMainView view;

    @Inject
    public TestMainPresenter(IMainView view) {
        this.view = view;
    }

    @Override
    public void onCreate() {
        view.showToast("Greetings from test presenter!");
    }
}
