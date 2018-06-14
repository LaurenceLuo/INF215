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
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ShowcaseUITest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void showcaseUITest() {
        ViewInteraction linearLayout = onView(
                allOf(withId(R.id.container),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.recyclerView),
                                        4),
                                0),
                        isDisplayed()));
        linearLayout.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.playButton),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction frameLayout = onView(
                allOf(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class), isDisplayed()));
        frameLayout.check(matches(isDisplayed()));

        ViewInteraction imageView = onView(
                allOf(withId(R.id.animationView),
                        childAtPosition(
                                allOf(withId(R.id.animationContainer),
                                        childAtPosition(
                                                withId(R.id.container),
                                                0)),
                                0),
                        isDisplayed()));
        imageView.check(matches(isDisplayed()));

        ViewInteraction imageButton = onView(
                allOf(withId(R.id.playButton),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        imageButton.check(matches(isDisplayed()));

        ViewInteraction seekBar = onView(
                allOf(withId(R.id.seekBar),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlsContainer),
                                        0),
                                1),
                        isDisplayed()));
        seekBar.check(matches(isDisplayed()));

        ViewInteraction imageButton2 = onView(
                allOf(withId(R.id.loopButton),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlsContainer),
                                        0),
                                2),
                        isDisplayed()));
        imageButton2.check(matches(isDisplayed()));

        ViewInteraction textView = onView(
                allOf(withId(R.id.lottieVersionView), withText("Lottie 2.5.5"),
                        childAtPosition(
                                allOf(withId(R.id.controlsContainer),
                                        childAtPosition(
                                                withId(R.id.container),
                                                1)),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("Lottie 2.5.5")));

        ViewInteraction horizontalScrollView = onView(
                allOf(withId(R.id.controlBar),
                        childAtPosition(
                                allOf(withId(R.id.container),
                                        childAtPosition(
                                                withId(R.id.coordinatorLayout),
                                                0)),
                                2),
                        isDisplayed()));
        horizontalScrollView.check(matches(isDisplayed()));

        ViewInteraction linearLayout2 = onView(
                allOf(withId(R.id.renderGraphToggle),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                0),
                        isDisplayed()));
        linearLayout2.check(matches(isDisplayed()));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.textView), withText("Render Graph"),
                        childAtPosition(
                                allOf(withId(R.id.renderGraphToggle),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        textView2.check(matches(withText("Render Graph")));

        ViewInteraction linearLayout3 = onView(
                allOf(withId(R.id.warningsButton),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                1),
                        isDisplayed()));
        linearLayout3.check(matches(isDisplayed()));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.textView), withText("0 warnings"),
                        childAtPosition(
                                allOf(withId(R.id.warningsButton),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                1)),
                                1),
                        isDisplayed()));
        textView3.check(matches(withText("0 warnings")));

        ViewInteraction linearLayout4 = onView(
                allOf(withId(R.id.borderToggle),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                2),
                        isDisplayed()));
        linearLayout4.check(matches(isDisplayed()));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.textView), withText("Border"),
                        childAtPosition(
                                allOf(withId(R.id.borderToggle),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                2)),
                                1),
                        isDisplayed()));
        textView4.check(matches(withText("Border")));

        ViewInteraction linearLayout5 = onView(
                allOf(withId(R.id.backgroundColorToggle),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                3),
                        isDisplayed()));
        linearLayout5.check(matches(isDisplayed()));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.textView), withText("Background"),
                        childAtPosition(
                                allOf(withId(R.id.backgroundColorToggle),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                3)),
                                1),
                        isDisplayed()));
        textView5.check(matches(withText("Background")));

        ViewInteraction imageButton3 = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withId(R.id.toolbar),
                                        childAtPosition(
                                                withId(R.id.coordinatorLayout),
                                                1)),
                                0),
                        isDisplayed()));
        imageButton3.check(matches(isDisplayed()));

        ViewInteraction linearLayoutCompat = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.toolbar),
                                childAtPosition(
                                        withId(R.id.coordinatorLayout),
                                        1)),
                        1),
                        isDisplayed()));
        linearLayoutCompat.check(matches(isDisplayed()));

        ViewInteraction controlBarItemToggleView = onView(
                allOf(withId(R.id.renderGraphToggle), withText("Render Graph"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                0)));
        controlBarItemToggleView.perform(scrollTo(), click());

        ViewInteraction frameLayout2 = onView(
                allOf(withId(R.id.renderTimesGraphContainer),
                        childAtPosition(
                                allOf(withId(R.id.controlsContainer),
                                        childAtPosition(
                                                withId(R.id.container),
                                                1)),
                                0),
                        isDisplayed()));
        frameLayout2.check(matches(isDisplayed()));

        ViewInteraction linearLayout6 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.controlsContainer),
                                childAtPosition(
                                        withId(R.id.container),
                                        1)),
                        1),
                        isDisplayed()));
        linearLayout6.check(matches(isDisplayed()));

        ViewInteraction viewGroup = onView(
                allOf(withId(R.id.renderTimesGraph),
                        childAtPosition(
                                allOf(withId(R.id.renderTimesGraphContainer),
                                        childAtPosition(
                                                withId(R.id.controlsContainer),
                                                0)),
                                1),
                        isDisplayed()));
        viewGroup.check(matches(isDisplayed()));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.renderTimesPerLayerButton), withText("View render times per layer"),
                        childAtPosition(
                                allOf(withId(R.id.controlsContainer),
                                        childAtPosition(
                                                withId(R.id.container),
                                                1)),
                                2),
                        isDisplayed()));
        textView6.check(matches(withText("View render times per layer")));

        ViewInteraction imageButton4 = onView(
                allOf(withId(R.id.playButton),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        imageButton4.check(matches(isDisplayed()));

        ViewInteraction imageButton5 = onView(
                allOf(withId(R.id.loopButton),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlsContainer),
                                        1),
                                2),
                        isDisplayed()));
        imageButton5.check(matches(isDisplayed()));

        ViewInteraction linearLayout7 = onView(
                allOf(withId(R.id.renderGraphToggle),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                0),
                        isDisplayed()));
        linearLayout7.check(matches(isDisplayed()));

        ViewInteraction controlBarItemToggleView2 = onView(
                allOf(withId(R.id.warningsButton), withText("0 warnings"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                1)));
        controlBarItemToggleView2.perform(scrollTo(), click());

        ViewInteraction controlBarItemToggleView3 = onView(
                allOf(withId(R.id.borderToggle), withText("Border"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                2)));
        controlBarItemToggleView3.perform(scrollTo(), click());

        ViewInteraction controlBarItemToggleView4 = onView(
                allOf(withId(R.id.backgroundColorToggle), withText("Background"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                3)));
        controlBarItemToggleView4.perform(scrollTo(), click());

        ViewInteraction controlBarItemToggleView5 = onView(
                allOf(withId(R.id.borderToggle), withText("Border"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.controlBar),
                                        0),
                                2)));
        controlBarItemToggleView5.perform(scrollTo(), click());

        ViewInteraction view = onView(
                allOf(withId(R.id.backgroundButton1),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                0),
                        isDisplayed()));
        view.check(matches(isDisplayed()));

        ViewInteraction linearLayout8 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.backgroundColorContainer),
                                childAtPosition(
                                        withId(R.id.container),
                                        1)),
                        0),
                        isDisplayed()));
        linearLayout8.check(matches(isDisplayed()));

        ViewInteraction view2 = onView(
                allOf(withId(R.id.backgroundButton2),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                1),
                        isDisplayed()));
        view2.check(matches(isDisplayed()));

        ViewInteraction view3 = onView(
                allOf(withId(R.id.backgroundButton3),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                2),
                        isDisplayed()));
        view3.check(matches(isDisplayed()));

        ViewInteraction view4 = onView(
                allOf(withId(R.id.backgroundButton4),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                3),
                        isDisplayed()));
        view4.check(matches(isDisplayed()));

        ViewInteraction view5 = onView(
                allOf(withId(R.id.backgroundButton5),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                4),
                        isDisplayed()));
        view5.check(matches(isDisplayed()));

        ViewInteraction imageButton6 = onView(
                allOf(withId(R.id.closeBackgroundColorButton),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                6),
                        isDisplayed()));
        imageButton6.check(matches(isDisplayed()));

        ViewInteraction backgroundColorView = onView(
                allOf(withId(R.id.backgroundButton4),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                3),
                        isDisplayed()));
        backgroundColorView.perform(click());

        ViewInteraction backgroundColorView2 = onView(
                allOf(withId(R.id.backgroundButton4),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                3),
                        isDisplayed()));
        backgroundColorView2.perform(click());

        ViewInteraction backgroundColorView3 = onView(
                allOf(withId(R.id.backgroundButton6),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                5),
                        isDisplayed()));
        backgroundColorView3.perform(click());

        ViewInteraction backgroundColorView4 = onView(
                allOf(withId(R.id.backgroundButton5),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.backgroundColorContainer),
                                        0),
                                4),
                        isDisplayed()));
        backgroundColorView4.perform(click());

        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.visibility), withContentDescription("Hide Controls"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.toolbar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView.perform(click());

        ViewInteraction frameLayout3 = onView(
                allOf(withId(R.id.animationContainer),
                        childAtPosition(
                                allOf(withId(R.id.container),
                                        childAtPosition(
                                                withId(R.id.coordinatorLayout),
                                                0)),
                                0),
                        isDisplayed()));
        frameLayout3.check(matches(isDisplayed()));

        ViewInteraction imageView2 = onView(
                allOf(withId(R.id.animationView),
                        childAtPosition(
                                allOf(withId(R.id.animationContainer),
                                        childAtPosition(
                                                withId(R.id.container),
                                                0)),
                                0),
                        isDisplayed()));
        imageView2.check(matches(isDisplayed()));

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.visibility), withContentDescription("Hide Controls"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.toolbar),
                                        1),
                                0),
                        isDisplayed()));
        textView7.check(matches(withText("")));

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withId(R.id.toolbar),
                                        childAtPosition(
                                                withId(R.id.coordinatorLayout),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatImageButton2.perform(click());

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
