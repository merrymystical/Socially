NavigationFlowTest.kt package com.example.socially

import androidx.test.espresso.Espresso.onView 
import androidx.test.espresso.action.ViewActions.click 
import androidx.test.espresso.assertion.ViewAssertions.matches 
import androidx.test.espresso.matcher.ViewMatchers.withId 
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed 
import androidx.test.ext.junit.runners.AndroidJUnit4 
import androidx.test.rule.ActivityTestRule 
import org.junit.Rule 
import org.junit.Test 
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class) class NavigationFlowTest {

@Test
fun fromMainToLogin_onSmdClick_navigatesToLogin() {
    // Click the SMD button to navigate to LoginActivity
    onView(withId(R.id.tvSMD)).perform(click())

    // Verify that LoginActivity is displayed by checking a view on that screen
    onView(withId(R.id.btnLogin)).check(matches(isDisplayed()))
}

@Test
fun fromLogin_toLogin2_onLoginClick_navigatesToLogin2() {
    // Navigate to LoginActivity first
    onView(withId(R.id.tvSMD)).perform(click())

    // Click the "Log in" button to go to Login2Activity
    onView(withId(R.id.btnLogin)).perform(click())
}

@Test
fun fromLogin_toSignup_onSignUpClick_navigatesToSignup() {
    // Navigate from main to LoginActivity
    onView(withId(R.id.tvSMD)).perform(click())

    // Clicking Sign up TextView to go from LoginActivity to SignupActivity
    onView(withId(R.id.tvSignUp)).perform(click())
}
}