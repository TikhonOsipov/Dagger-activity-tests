package com.tixon.daggeractivitytests.screens.main_activity;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 13.12.16
 */

public class MainPresenter implements IMainPresenter {
    private IMainView view;

    @Inject
    public MainPresenter(IMainView view) {
        this.view = view;
    }

    @Override
    public void onCreate() {
        view.showToast("hey");
    }
}
