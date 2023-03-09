package com.cydeo.step_definitions;


import com.cydeo.pages.LoginPage_JM;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US90_MobileAppOptions_StepDefs {

    LoginPage_JM loginPageJm = new LoginPage_JM();

    @Then("user scrolls down the page to MOBILE APPLICATION APP STORE element")
    public void user_scrolls_down_the_page_to_mobile_application_appStore() {

        loginPageJm.scrollToElement(loginPageJm.link_mobileApplicationAppStore);
    }

    @Then("user scrolls down the page to MOBILE APPLICATION GOOGLE PLAY element")
    public void user_scrolls_down_the_page_to_mobile_application_googlePlay() {

        loginPageJm.scrollToElement(loginPageJm.link_mobileApplicationGooglePlay);
    }

    @Then("user should see GOOGLE PLAY option under MOBILE APPLICATION")
    public void user_should_see_google_play_option_under_mobile_application() {

        Assert.assertTrue(loginPageJm.link_mobileApplicationGooglePlay.isDisplayed());
    }

    @Then("user should see APP STORE option under MOBILE APPLICATION")
    public void user_should_see_app_store_option_under_mobile_application() {

        Assert.assertTrue(loginPageJm.link_mobileApplicationAppStore.isDisplayed());
    }


}
