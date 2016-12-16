package com.tixon.daggeractivitytests;

import android.app.Application;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.tixon.daggeractivitytests.app.IApp;
import com.tixon.daggeractivitytests.screens.main_activity.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by tikhon.osipov on 15.12.16
 */

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SampleActivityTest {
    IApp app;

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new DaggerActivityTestRule<>(MainActivity.class,
                    new DaggerActivityTestRule.OnBeforeActivityLaunchedListener<MainActivity>()
                    {
                        @Override
                        public void beforeActivityLaunched(@NonNull Application application,
                                                           @NonNull MainActivity activity) {
                            app = (TestApp) application;
                        }

                        @Override
                        public void afterActivityLaunched(@NonNull Application application, @NonNull MainActivity activity) {

                        }
                    });

    /*@Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, true);*/

    @Test
    public void testMainActivity() throws Exception {
        SystemClock.sleep(5000L);
        assertEquals(2+2, 4);
    }
}
