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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SecondFrameLayoutTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void secondFrameLayoutTest() {
        ViewInteraction bottomNavigationItemView = onView(
                allOf(withId(R.id.preview),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.bottomNavigation),
                                        0),
                                1),
                        isDisplayed()));
        bottomNavigationItemView.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction linearLayout = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.container),
                                0),
                        0),
                        isDisplayed()));
        linearLayout.check(matches(isDisplayed()));

        ViewInteraction textView = onView(
                allOf(withId(R.id.titleView), withText("Preview"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("Preview")));

        ViewInteraction linearLayout2 = onView(
                allOf(withId(R.id.qr),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.container),
                                        0),
                                1),
                        isDisplayed()));
        linearLayout2.check(matches(isDisplayed()));

        ViewInteraction linearLayout3 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.qr),
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        1)),
                        0),
                        isDisplayed()));
        linearLayout3.check(matches(isDisplayed()));

        ViewInteraction imageView = onView(
                allOf(withId(R.id.iconView),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.qr),
                                        0),
                                0),
                        isDisplayed()));
        imageView.check(matches(isDisplayed()));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.titleView), withText("Scan a QR code"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.qr),
                                        0),
                                1),
                        isDisplayed()));
        textView2.check(matches(withText("Scan a QR code")));

        ViewInteraction view = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.qr),
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        1)),
                        1),
                        isDisplayed()));
        view.check(matches(isDisplayed()));

        ViewInteraction linearLayout4 = onView(
                allOf(withId(R.id.file),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.container),
                                        0),
                                2),
                        isDisplayed()));
        linearLayout4.check(matches(isDisplayed()));

        ViewInteraction imageView2 = onView(
                allOf(withId(R.id.iconView),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.file),
                                        0),
                                0),
                        isDisplayed()));
        imageView2.check(matches(isDisplayed()));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.titleView), withText("Open a file"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.file),
                                        0),
                                1),
                        isDisplayed()));
        textView3.check(matches(withText("Open a file")));

        ViewInteraction view2 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.file),
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        2)),
                        1),
                        isDisplayed()));
        view2.check(matches(isDisplayed()));

        ViewInteraction linearLayout5 = onView(
                allOf(withId(R.id.url),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.container),
                                        0),
                                3),
                        isDisplayed()));
        linearLayout5.check(matches(isDisplayed()));

        ViewInteraction imageView3 = onView(
                allOf(withId(R.id.iconView),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.url),
                                        0),
                                0),
                        isDisplayed()));
        imageView3.check(matches(isDisplayed()));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.titleView), withText("Enter a URL to a json or zip file"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.url),
                                        0),
                                1),
                        isDisplayed()));
        textView4.check(matches(withText("Enter a URL to a json or zip file")));

        ViewInteraction viewGroup = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.bottomNavigation),
                                childAtPosition(
                                        withId(R.id.root),
                                        1)),
                        0),
                        isDisplayed()));
        viewGroup.check(matches(isDisplayed()));

        ViewInteraction frameLayout = onView(
                allOf(withId(R.id.showcase),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.bottomNavigation),
                                        0),
                                0),
                        isDisplayed()));
        frameLayout.check(matches(isDisplayed()));

        ViewInteraction viewGroup2 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.showcase),
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                        0)),
                        0),
                        isDisplayed()));
        viewGroup2.check(matches(isDisplayed()));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.smallLabel), withText("Showcase"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.showcase),
                                        0),
                                0),
                        isDisplayed()));
        textView5.check(matches(withText("Showcase")));

        ViewInteraction frameLayout2 = onView(
                allOf(withId(R.id.preview),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.bottomNavigation),
                                        0),
                                1),
                        isDisplayed()));
        frameLayout2.check(matches(isDisplayed()));

        ViewInteraction imageView4 = onView(
                allOf(withId(R.id.icon),
                        childAtPosition(
                                allOf(withId(R.id.preview),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                1)),
                                0),
                        isDisplayed()));
        imageView4.check(matches(isDisplayed()));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.largeLabel), withText("Preview"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.preview),
                                        1),
                                0),
                        isDisplayed()));
        textView6.check(matches(withText("Preview")));

        ViewInteraction viewGroup3 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.lottiefiles),
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                        2)),
                        0),
                        isDisplayed()));
        viewGroup3.check(matches(isDisplayed()));

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
