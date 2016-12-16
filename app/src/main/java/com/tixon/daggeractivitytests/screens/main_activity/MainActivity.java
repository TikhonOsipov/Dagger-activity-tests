package com.tixon.daggeractivitytests.screens.main_activity;

import android.os.Bundle;
import android.widget.Toast;

import com.tixon.daggeractivitytests.R;
import com.tixon.daggeractivitytests.app.IApp;
import com.tixon.daggeractivitytests.base.BaseActivity;
import com.tixon.daggeractivitytests.dagger.components.ITestScreensComponent;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements IMainView {

    @Inject
    IMainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.onCreate();
    }

    @Override
    public void setupComponent() {
        IApp app = (IApp) getApplication();
        ITestScreensComponent component = (ITestScreensComponent) app.plusScreensComponent(this);
        component.inject(this);
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
