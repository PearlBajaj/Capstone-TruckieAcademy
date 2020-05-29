package com.example.augmentedhighereducationfortruckdrivers;

import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import com.google.firebase.auth.FirebaseAuth;

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

public class ForgotPasswordActivityTest {

    @Rule
    public ActivityTestRule<ForgotPasswordActivity> fActivityTestRule = new ActivityTestRule<ForgotPasswordActivity>(ForgotPasswordActivity.class, false, false);

    private ForgotPasswordActivity fActivity = null;

    @Before
    public void setUp() throws Exception {
        fActivity = fActivityTestRule.getActivity();
    }

    @Test
    public void testImageViewIsNotSelected() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(not(isSelected())));
    }

    @Test
    public void testImageViewIsNotEmpty() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherImageViewIsDisplayed() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.imageView)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherImageViewIsEnabled() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherImageViewIsCompletelyDisplayed() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherImageViewIsNotFocusable() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(not(isFocusable())));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherImageViewIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.imageView)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testEmailIsNotSelected() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(not(isSelected())));
    }

    @Test
    public void testEmailIsEmpty() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(withText("")));
    }

    @Test
    public void testWhetherEmailIsDisplayed() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.email)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherEmailIsEnabled() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherEmailIsCompletelyDisplayed() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherEmailIsFocusable() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherEmailIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.email)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testForgotPasswordIsNotSelected() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.ForgotPassword)).check(matches(not(isSelected())));
    }

    @Test
    public void testForgotPasswordIsNotEmpty() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.ForgotPassword)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherForgotPasswordIsDisplayed() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.ForgotPassword)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherForgotPasswordIsEnabled() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.ForgotPassword)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherForgotPasswordIsCompletelyDisplayed() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.ForgotPassword)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherForgotPasswordIsNotFocusable() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.ForgotPassword)).check(matches(not(isFocusable())));
    }

    @Test
    public void testWhetherForgotPasswordIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.ForgotPassword)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherForgotPasswordIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.ForgotPassword)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherForgotPasswordIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.ForgotPassword)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testPasswordDesIsNotSelected() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.PasswordDes)).check(matches(not(isSelected())));
    }

    @Test
    public void testPasswordDesIsNotEmpty() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.PasswordDes)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherPasswordDesIsDisplayed() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.PasswordDes)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherPasswordDesIsEnabled() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.PasswordDes)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherPasswordDesIsCompletelyDisplayed() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.PasswordDes)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherPasswordDesIsNotFocusable() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.PasswordDes)).check(matches(not(isFocusable())));
    }

    @Test
    public void testWhetherPasswordDesIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.PasswordDes)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherPasswordDesIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.PasswordDes)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherPasswordDesIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.PasswordDes)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testBackIsNotSelected() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.Back)).check(matches(not(isSelected())));
    }

    @Test
    public void testBackIsNotEmpty() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.Back)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherBackIsDisplayed() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.Back)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherBackIsEnabled() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Back)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherBackIsCompletelyDisplayed() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Back)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherBackIsFocusable() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Back)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherBackIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Back)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherBackIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Back)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherBackIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.Back)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testResetPasswordIsNotSelected() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.resetPassword)).check(matches(not(isSelected())));
    }

    @Test
    public void testResetPasswordIsNotEmpty() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.resetPassword)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherResetPasswordIsDisplayed() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.resetPassword)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherResetPasswordIsEnabled() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.resetPassword)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherResetPasswordIsCompletelyDisplayed() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.resetPassword)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherResetPasswordIsFocusable() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.resetPassword)).check(matches(isFocusable()));
    }

    @Test
    public void testWhetherResetPasswordIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.resetPassword)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherResetPasswordIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.resetPassword)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherResetPasswordIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.resetPassword)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testLinearLayoutIsNotSelected() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(not(isSelected())));
    }

    @Test
    public void testLinearLayoutIsNotEmpty() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(not(withText(""))));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayed() {
        Intent i = new Intent();
        fActivityTestRule.launchActivity(i);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void testWhetherLinearLayoutIsEnabled() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isEnabled()));
    }

    @Test
    public void testWhetherLinearLayoutIsCompletelyDisplayed() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isCompletelyDisplayed()));
    }

    @Test
    public void testWhetherLinearLayoutIsNotFocusable() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(not(isFocusable())));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast1() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(1)));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast2() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(2)));
    }

    @Test
    public void testWhetherLinearLayoutIsDisplayedAtLeast10() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        onView(withId(R.id.linearLayout)).check(matches(isDisplayingAtLeast(10)));
    }

    @Test
    public void testWhetherEqual1() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        assertEquals(ForgotPasswordActivity.inputEmail, fActivityTestRule.getActivity().findViewById(R.id.email));
    }

    @Test
    public void testWhetherEqual2() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        assertEquals(ForgotPasswordActivity.Back, fActivityTestRule.getActivity().findViewById(R.id.Back));
    }

    @Test
    public void testWhetherEqual3() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        assertEquals(ForgotPasswordActivity.Reset, fActivityTestRule.getActivity().findViewById(R.id.resetPassword));
    }

    @Test
    public void testWhetherEqual4() {
        Intent intent = new Intent();
        fActivityTestRule.launchActivity(intent);
        assertEquals(ForgotPasswordActivity.auth, FirebaseAuth.getInstance());
    }

    @After
    public void tearDown() throws Exception {
        fActivity = null;
    }
}