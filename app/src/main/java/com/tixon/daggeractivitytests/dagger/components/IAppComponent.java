package com.tixon.daggeractivitytests.dagger.components;

import com.tixon.daggeractivitytests.dagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tikhon.osipov on 13.12.16
 */

@Singleton
@Component(modules = {AppModule.class})
public interface IAppComponent {
}
