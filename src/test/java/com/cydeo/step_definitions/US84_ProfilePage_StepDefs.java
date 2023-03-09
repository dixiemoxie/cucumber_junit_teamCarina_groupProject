package com.cydeo.step_definitions;

import com.cydeo.pages.US84_ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US84_ProfilePage_StepDefs {

    US84_ProfilePage profilePage = new US84_ProfilePage();

    @When("user clicks on user profile")
    public void userClicksOnUserProfile() {
        profilePage.userProfileBtn.click();
    }

    @And("clicks on my profile")
    public void clicksOnMyProfile() {
        profilePage.myProfileLink.click();
    }

    @Then("user should see all five options under the user profile")
    public void userShouldSeeAllFiveOptionsUnderTheUserProfile() {
        for (WebElement option : profilePage.userProfileOptions) {
            Assert.assertTrue(option.isDisplayed());
        }
    }
}
