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

public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> lActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class, false, false);

    private LoginActivity lActivity = null;

    @Before
    public void setUp() throws Exception {
        lActivity = lActivityTestRule.getActivity();
    }

    @Test
    public void testImageViewIsNotSelected() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(not(isSelected())));
    }

    @Test
    public void testImageViewIsNotEmpty() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherImageViewIsDisplayed() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherImageViewIsEnabled() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherImageViewIsCompletelyDisplayed() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherImageViewIsNotFocusable() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(not(isFocusable())));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testEmailIsNotSelected() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(not(isSelected())));
    }

    @Test
    public void testEmailIsEmpty() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(withText("")));
    }

    @Test
    public void testWhetherEmailIsDisplayed() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherEmailIsEnabled() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherEmailIsCompletelyDisplayed() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherEmailIsFocusable() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testPasswordIsNotSelected() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.password)).check(matches(not(isSelected())));
    }

    @Test
    public void testPasswordIsEmpty() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.password)).check(matches(withText("")));
    }

    @Test
    public void testWhetherPasswordIsDisplayed() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.password)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherPasswordIsEnabled() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherPasswordIsCompletelyDisplayed() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherPasswordIsFocusable() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherPasswordIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherPasswordIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherPasswordIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.password)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testForgotPasswordIsNotSelected() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.forgotpassword)).check(matches(not(isSelected())));
    }

    @Test
    public void testForgotPasswordIsNotEmpty() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.forgotpassword)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherForgotPasswordIsDisplayed() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.forgotpassword)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherForgotPasswordIsEnabled() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.forgotpassword)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherForgotPasswordIsCompletelyDisplayed() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.forgotpassword)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherForgotPasswordIsFocusable() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.forgotpassword)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherForgotPasswordIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.forgotpassword)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherForgotPasswordIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.forgotpassword)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherForgotPasswordIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.forgotpassword)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testLoginIsNotSelected() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.Login)).check(matches(not(isSelected())));
    }

    @Test
    public void testLoginIsNotEmpty() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.Login)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherLoginIsDisplayed() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.Login)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherLoginIsEnabled() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Login)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherLoginIsCompletelyDisplayed() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Login)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherLoginIsFocusable() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Login)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherLoginIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Login)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherLoginIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Login)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherLoginIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Login)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testRegisterIsNotSelected() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.Register)).check(matches(not(isSelected())));
    }

    @Test
    public void testRegisterIsNotEmpty() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.Register)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherRegisterIsDisplayed() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.Register)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherRegisterIsEnabled() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Register)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherRegisterIsCompletelyDisplayed() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Register)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherRegisterIsFocusable() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Register)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherRegisterIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Register)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherRegisterIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Register)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherRegisterIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Register)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testLinearLayoutIsNotSelected() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(not(isSelected())));
    }

    @Test
    public void testLinearLayoutIsNotEmpty() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayed() {
        Intent i = new Intent();
        lActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherLinearLayoutIsEnabled() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherLinearLayoutIsCompletelyDisplayed() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherLinearLayoutIsNotFocusable() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(not(isFocusable())));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testWhetherEqual1() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        assertEquals(LoginActivity.emailTB, lActivityTestRule.getActivity().findViewById(R.id.email));
    }

    @Test
    public void testWhetherEqual2() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        assertEquals(LoginActivity.login, lActivityTestRule.getActivity().findViewById(R.id.Login));
    }

    @Test
    public void testWhetherEqual3() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        assertEquals(LoginActivity.register, lActivityTestRule.getActivity().findViewById(R.id.Register));
    }

    @Test
    public void testWhetherEqual4() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        assertEquals(LoginActivity.passwordTB, lActivityTestRule.getActivity().findViewById(R.id.password));
    }

    @Test
    public void testWhetherEqual5() {
        Intent intent = new Intent();
        lActivityTestRule.launchActivity(intent);
        assertEquals(LoginActivity.passwordreset, lActivityTestRule.getActivity().findViewById(R.id.forgotpassword));
    }

    @After
    public void tearDown() throws Exception {
        lActivity = null;
    }
}