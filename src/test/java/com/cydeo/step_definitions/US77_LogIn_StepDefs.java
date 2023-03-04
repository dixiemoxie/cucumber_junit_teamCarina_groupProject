package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US77_LogIn_StepDefs {


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
    public void userEntersInLogInField(String invalidLoginName) {

        loginPage.txt_Login.sendKeys(invalidLoginName);
    }

    @And("user enters {string} in password field")
    public void userEntersInPassWordField(String invalidPassword) {

        loginPage.txt_Password.sendKeys(invalidPassword);
    }


    @When("user logs in as {string}")
    public void userLogsInAs(String userType) {

        String username = "";
        String password = "";

        if(userType.equals("Helpdesk")) {

            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        } else if(userType.equals("Human Resource")) {

            username = ConfigurationReader.getProperty("human_resource_username");
            password = ConfigurationReader.getProperty("human_resource_password");
        } else if(userType.equals("Marketing")) {

            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }

        loginPage.logIn(username, password);
    }



}
