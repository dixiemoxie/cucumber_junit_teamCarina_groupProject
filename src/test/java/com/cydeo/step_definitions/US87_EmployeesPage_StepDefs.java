package com.cydeo.step_definitions;

import com.cydeo.pages.US87_EmployeesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US87_EmployeesPage_StepDefs {

    US87_EmployeesPage employeesPage = new US87_EmployeesPage();

    @When("user clicks on the employees button")
    public void userClicksOnTheEmployeesButton() {
        employeesPage.btn_employees.click();
    }

    @Then("user should see all modules in the employees page")
    public void userShouldSeeAllModulesInTheEmployeesPage() {
        for (WebElement module : employeesPage.topMenuModules) {
            Assert.assertTrue(module.isDisplayed());
        }
    }
}
