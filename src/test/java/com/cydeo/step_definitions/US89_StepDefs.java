package com.cydeo.step_definitions;

import com.cydeo.pages.CompanyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US89_StepDefs {

    CompanyPage companyPage = new CompanyPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {


    }

    @When("user clicks Company module")
    public void user_clicks_company_module() {
    companyPage.CompanyButton.click();

    }

    @Then("user verifies if {string} is displayed")
    public void user_verifies_is_displayed(String string) {



    }
}
