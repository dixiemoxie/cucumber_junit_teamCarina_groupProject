package com.cydeo.step_definitions;

import com.cydeo.pages.CompanyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US89_StepDefs {

    CompanyPage companyPage = new CompanyPage();

    @When("user clicks Company module")
    public void user_clicks_company_module() {
    companyPage.CompanyButton.click();

    }


    @Then("user verifies if WebElements are displayed")
    public void userVerifiesIfWebElementsAreDisplayed (List<String> expectedText) {



        Assert.assertEquals(expectedText, companyPage.getTextOfElementList());


    }
}
