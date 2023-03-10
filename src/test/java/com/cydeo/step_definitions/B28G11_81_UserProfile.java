package com.cydeo.step_definitions;

import com.cydeo.pages.B28G11_81_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B28G11_81_UserProfile {

    B28G11_81_homePage homePage_81 = new B28G11_81_homePage();

    @When("click on the user profile")
    public void clickOnTheUserProfile() {
        homePage_81.userProfile.click();
    }

    @Then("User should be able to see My Profile options")
    public void userShouldBeAbleToSeeMyProfileOptions() {
        Assert.assertTrue(homePage_81.myProfile.isDisplayed());
    }

    @Then("User should be able to see Edit Profile Settings options")
    public void userShouldBeAbleToSeeEditProfileSettingsOptions() {
        Assert.assertTrue(homePage_81.editProfileSettings.isDisplayed());
    }

    @Then("User should be able to see Themes options")
    public void userShouldBeAbleToSeeThemesOptions() {
        Assert.assertTrue(homePage_81.themes.isDisplayed());
    }

    @Then("User should be able to see Configure notifications options")
    public void userShouldBeAbleToSeeConfigureNotificationsOptions() {
        Assert.assertTrue(homePage_81.configureNotifications.isDisplayed());
    }

    @Then("User should be able to see Log out options")
    public void userShouldBeAbleToSeeLogOutOptions() {
        Assert.assertTrue(homePage_81.logOut.isDisplayed());
    }
}
