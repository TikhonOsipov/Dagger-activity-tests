package com.tixon.daggeractivitytests.dagger.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by tikhon.osipov on 13.12.16
 */

@Scope @Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
