package com.tixon.daggeractivitytests;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.tixon.daggeractivitytests.app.App;
import com.tixon.daggeractivitytests.screens.main_activity.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by tikhon.osipov on 13.12.16
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    private App app;

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new DaggerActivityTestRule<>(MainActivity.class,
                    new DaggerActivityTestRule.OnBeforeActivityLaunchedListener<MainActivity>()
                    {
                        @Override
                        public void beforeActivityLaunched(@NonNull Application application,
                                                           @NonNull MainActivity activity) {
                            app = (App) application;
                        }

                        @Override
                        public void afterActivityLaunched(@NonNull Application application, @NonNull MainActivity activity) {

                        }
                    });

    @Before
    public void setUp() {
        MainActivity activity = mainActivityActivityTestRule.getActivity();

        /*IScreensComponent testScreenComponent = DaggerIScreensComponent.builder()
                .iAppComponent(app.getAppComponent())
                .screensModule(new TestScreensModule(activity))
                .build();
        activity.setComponent(testScreenComponent);
        Intent startIntent = new Intent();
        startIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mainActivityActivityTestRule.launchActivity(startIntent);*/
    }

    @Test
    public void testMainActivity() {
        assertEquals(2+2, 4);
    }
}
