package com.cydeo.step_definitions;

import com.cydeo.pages.US83Page;
import com.cydeo.utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US83_step_definitions {

    US83Page us83Page = new US83Page();
    List<WebElement> listOfModules = us83Page.listOfModulesMenu;

    @Given("User clicks on the Chat and Calls module")
    public void user_clicks_on_the_chat_and_calls_module() {
      us83Page.chatAndCallsModule.click();
        BrowserUtils.sleep(2);
    }

    @Then("User should see {int} sub-modules displayed")
    public void userShouldSeeSubModulesDisplayed(int expected_sub_modules) {

        for(WebElement each : listOfModules){
            Assert.assertEquals(expected_sub_modules,listOfModules.size());
        }

        System.out.println("us83Page.msgBtn.isDisplayed() = " + us83Page.msgBtn.isDisplayed());
        System.out.println("us83Page.notificationsBtn.isDisplayed() = " + us83Page.notificationsBtn.isDisplayed());
        System.out.println("us83Page.settingsBtn.isDisplayed() = " + us83Page.settingsBtn.isDisplayed());
        System.out.println("us83Page.activityStreamBtn.isDisplayed() = " + us83Page.activityStreamBtn.isDisplayed());

    }
}
