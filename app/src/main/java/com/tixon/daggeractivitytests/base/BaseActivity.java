package com.tixon.daggeractivitytests.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tikhon.osipov on 13.12.16
 */

public abstract class BaseActivity extends AppCompatActivity {
    public abstract void setupComponent();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent();
    }
}
