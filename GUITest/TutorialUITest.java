package com.airbnb.lottie.samples;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TutorialUITest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tutorialUITest() {
        ViewInteraction cardView = onView(
                allOf(withId(R.id.cardView),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.airbnb.lottie.samples.views.ShowcaseCarousel")),
                                        0),
                                0),
                        isDisplayed()));
        cardView.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction frameLayout = onView(
                allOf(withParent(allOf(withId(R.id.intro_activity_viewPager),
                        childAtPosition(
                                withId(R.id.intro_activity_root),
                                0))),
                        isDisplayed()));
        frameLayout.check(matches(isDisplayed()));

        ViewInteraction relativeLayout = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.intro_activity_progressIndicatorHolder),
                                childAtPosition(
                                        withId(R.id.intro_activity_navigation),
                                        0)),
                        0),
                        isDisplayed()));
        relativeLayout.check(matches(isDisplayed()));

        ViewInteraction button = onView(
                allOf(withId(R.id.intro_activity_leftButton),
                        childAtPosition(
                                allOf(withId(R.id.intro_activity_navigation),
                                        childAtPosition(
                                                withId(R.id.intro_activity_root),
                                                2)),
                                1),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

        ViewInteraction imageView = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                0),
                        0),
                        isDisplayed()));
        imageView.check(matches(isDisplayed()));

        ViewInteraction imageView2 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                1),
                        0),
                        isDisplayed()));
        imageView2.check(matches(isDisplayed()));

        ViewInteraction button2 = onView(
                allOf(withId(R.id.intro_activity_rightButton),
                        childAtPosition(
                                allOf(withId(R.id.intro_activity_navigation),
                                        childAtPosition(
                                                withId(R.id.intro_activity_root),
                                                2)),
                                3),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

        ViewInteraction button3 = onView(
                allOf(withId(R.id.intro_activity_rightButton),
                        childAtPosition(
                                allOf(withId(R.id.intro_activity_navigation),
                                        childAtPosition(
                                                withId(R.id.intro_activity_root),
                                                2)),
                                3),
                        isDisplayed()));
        button3.check(matches(isDisplayed()));

        ViewInteraction introButton = onView(
                allOf(withId(R.id.intro_activity_rightButton),
                        childAtPosition(
                                allOf(withId(R.id.intro_activity_navigation),
                                        childAtPosition(
                                                withId(R.id.intro_activity_root),
                                                2)),
                                2),
                        isDisplayed()));
        introButton.perform(click());

        ViewInteraction frameLayout2 = onView(
                allOf(withParent(allOf(withId(R.id.intro_activity_viewPager),
                        childAtPosition(
                                withId(R.id.intro_activity_root),
                                0))),
                        isDisplayed()));
        frameLayout2.check(matches(isDisplayed()));

        ViewInteraction imageView3 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                1),
                        0),
                        isDisplayed()));
        imageView3.check(matches(isDisplayed()));

        ViewInteraction imageView4 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                0),
                        0),
                        isDisplayed()));
        imageView4.check(matches(isDisplayed()));

        ViewInteraction introButton2 = onView(
                allOf(withId(R.id.intro_activity_rightButton),
                        childAtPosition(
                                allOf(withId(R.id.intro_activity_navigation),
                                        childAtPosition(
                                                withId(R.id.intro_activity_root),
                                                2)),
                                2),
                        isDisplayed()));
        introButton2.perform(click());

        ViewInteraction frameLayout3 = onView(
                allOf(withParent(allOf(withId(R.id.intro_activity_viewPager),
                        childAtPosition(
                                withId(R.id.intro_activity_root),
                                0))),
                        isDisplayed()));
        frameLayout3.check(matches(isDisplayed()));

        ViewInteraction introButton3 = onView(
                allOf(withId(R.id.intro_activity_rightButton),
                        childAtPosition(
                                allOf(withId(R.id.intro_activity_navigation),
                                        childAtPosition(
                                                withId(R.id.intro_activity_root),
                                                2)),
                                2),
                        isDisplayed()));
        introButton3.perform(click());

        ViewInteraction frameLayout4 = onView(
                allOf(withParent(allOf(withId(R.id.intro_activity_viewPager),
                        childAtPosition(
                                withId(R.id.intro_activity_root),
                                0))),
                        isDisplayed()));
        frameLayout4.check(matches(isDisplayed()));

        ViewInteraction button4 = onView(
                allOf(withId(R.id.intro_activity_finalButton),
                        childAtPosition(
                                allOf(withId(R.id.intro_activity_navigation),
                                        childAtPosition(
                                                withId(R.id.intro_activity_root),
                                                2)),
                                2),
                        isDisplayed()));
        button4.check(matches(isDisplayed()));

        ViewInteraction introButton4 = onView(
                allOf(withId(R.id.intro_activity_finalButton), withText("DONE"),
                        childAtPosition(
                                allOf(withId(R.id.intro_activity_navigation),
                                        childAtPosition(
                                                withId(R.id.intro_activity_root),
                                                2)),
                                3),
                        isDisplayed()));
        introButton4.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction linearLayout = onView(
                allOf(withId(R.id.action_bar_root),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        linearLayout.check(matches(isDisplayed()));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
