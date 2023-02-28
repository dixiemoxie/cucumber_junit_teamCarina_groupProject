package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {


    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("crm_URL"));
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Authorization"));
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {

        loginPage.btn_LogIn.click();
    }

    @Then("user should see error message")
    public void user_should_see_error_message() {

        Assert.assertTrue(loginPage.incorrectLoginText.isDisplayed());
    }

    @Then("user should land on the dashboard page")
    public void userShouldLandOnTheDashboardPage() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }

    @When("user enters {string} in login field")
    public void userEntersValidusernameInLoginField(String username) {

        loginPage.txt_Login.sendKeys(username);
    }

    @And("user enters {string} in password field")
    public void userEntersValidpasswordInPasswordField(String password) {

        loginPage.txt_Password.sendKeys(password);
    }


    @When("user enters {string} in log-in field")
    public void userEntersInLogInField(String invalidLoginName) {

        loginPage.txt_Login.sendKeys(invalidLoginName);
    }

    @And("user enters {string} in pass-word field")
    public void userEntersInPassWordField(String invalidPassword) {

        loginPage.txt_Password.sendKeys(invalidPassword);
    }


}
