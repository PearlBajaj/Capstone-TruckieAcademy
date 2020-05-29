package com.example.augmentedhighereducationfortruckdrivers;

import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayingAtLeast;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.isFocusable;
import static androidx.test.espresso.matcher.ViewMatchers.isSelected;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class RegisterActivityTest {

    @Rule
    public ActivityTestRule<RegisterActivity> rActivityTestRule = new ActivityTestRule<RegisterActivity>(RegisterActivity.class, false, false);

    private RegisterActivity rActivity = null;

    @Before
    public void setUp() throws Exception {
        rActivity = rActivityTestRule.getActivity();
    }

    @Test
    public void testImageViewIsNotSelected() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(not(isSelected())));
    }

    @Test
    public void testImageViewIsNotEmpty() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherImageViewIsDisplayed() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherImageViewIsEnabled() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherImageViewIsCompletelyDisplayed() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherImageViewIsNotFocusable() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(not(isFocusable())));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testEmailIsNotSelected() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(not(isSelected())));
    }

    @Test
    public void testEmailIsEmpty() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(withText("")));
    }

    @Test
    public void testWhetherEmailIsDisplayed() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherEmailIsEnabled() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherEmailIsCompletelyDisplayed() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherEmailIsFocusable() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testPasswordIsNotSelected() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.password)).check(matches(not(isSelected())));
    }

    @Test
    public void testPasswordIsEmpty() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.password)).check(matches(withText("")));
    }

    @Test
    public void testWhetherPasswordIsDisplayed() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.password)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherPasswordIsEnabled() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherPasswordIsCompletelyDisplayed() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherPasswordIsFocusable() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherPasswordIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherPasswordIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherPasswordIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testRegisterNowIsNotSelected() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.RegisterNow)).check(matches(not(isSelected())));
    }

    @Test
    public void testRegisterNowIsNotEmpty() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.RegisterNow)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherRegisterNowIsDisplayed() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.RegisterNow)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherRegisterNowIsEnabled() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.RegisterNow)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherRegisterNowIsCompletelyDisplayed() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.RegisterNow)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherRegisterNowIsFocusable() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.RegisterNow)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherRegisterNowIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.RegisterNow)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherRegisterNowIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.RegisterNow)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherRegisterNowIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.RegisterNow)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testLoginHereIsNotSelected() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.LoginHere)).check(matches(not(isSelected())));
    }

    @Test
    public void testLoginHereIsNotEmpty() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.LoginHere)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherLoginHereIsDisplayed() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.LoginHere)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherLoginHereIsEnabled() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.LoginHere)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherLoginHereIsCompletelyDisplayed() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.LoginHere)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherLoginHereIsFocusable() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.LoginHere)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherLoginHereIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.LoginHere)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherLoginHereIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.LoginHere)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherLoginHereIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.LoginHere)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testLinearLayoutIsNotSelected() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(not(isSelected())));
    }

    @Test
    public void testLinearLayoutIsNotEmpty() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayed() {
        Intent i = new Intent();
        rActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherLinearLayoutIsEnabled() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherLinearLayoutIsCompletelyDisplayed() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherLinearLayoutIsNotFocusable() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(not(isFocusable())));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testWhetherEqual1() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        assertEquals(RegisterActivity.emailTB, rActivityTestRule.getActivity().findViewById(R.id.email));
    }

    @Test
    public void testWhetherEqual2() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        assertEquals(RegisterActivity.login, rActivityTestRule.getActivity().findViewById(R.id.LoginHere));
    }

    @Test
    public void testWhetherEqual3() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        assertEquals(RegisterActivity.register, rActivityTestRule.getActivity().findViewById(R.id.RegisterNow));
    }

    @Test
    public void testWhetherEqual4() {
        Intent intent = new Intent();
        rActivityTestRule.launchActivity(intent);
        assertEquals(RegisterActivity.passwordTB, rActivityTestRule.getActivity().findViewById(R.id.password));
    }

    @After
    public void tearDown() throws Exception {
        rActivity = null;
    }
}