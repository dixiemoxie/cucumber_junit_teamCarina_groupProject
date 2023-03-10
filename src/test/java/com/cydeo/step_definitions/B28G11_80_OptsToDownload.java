package com.cydeo.step_definitions;

import com.cydeo.pages.B28G11_80_86_homePage;

import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B28G11_80_OptsToDownload {

   


    @When("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("home_page"));
    }

    B28G11_80_86_homePage homePage = new B28G11_80_86_homePage();
    @Then("user sees Desktop client module on the right side of the page")
    public void user_sees_desktop_client_module_on_the_right_side_of_the_page() {
        Assert.assertTrue(homePage.desktopClient.isDisplayed());
        Assert.assertTrue(homePage.macOsLink.isDisplayed());
        Assert.assertTrue(homePage.windowsLink.isDisplayed());
        Assert.assertTrue(homePage.linuxLink.isDisplayed());
    }


}
