package com.cydeo.step_definitions;

import com.cydeo.pages.B28G11_80_86_homePage;
import com.cydeo.pages.B28G11_86_TimeAndReportsPage;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B28G11_86_TimeAndReports {

    B28G11_80_86_homePage homePage = new B28G11_80_86_homePage();


    @When("clicks Time and Reports on the left side of the page")
    public void clicks_time_and_reports_on_the_left_side_of_the_page() {
        homePage.timeAndReportsLink.click();

    }
    @Then("user should land on the correct page")
    public void user_should_land_on_the_correct_page() {

        String expectedTitle = "Absence Chart";
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);

    }
B28G11_86_TimeAndReportsPage timeAndReportsPage = new B28G11_86_TimeAndReportsPage();
    @And("see all the modules at the top of the page")
    public void seeAllTheModulesAtTheTopOfThePage() {
Assert.assertTrue(timeAndReportsPage.absenceChartLink.isDisplayed());
Assert.assertTrue(timeAndReportsPage.workTimeLink.isDisplayed());
Assert.assertTrue(timeAndReportsPage.bitrixLink.isDisplayed());
Assert.assertTrue(timeAndReportsPage.workReportsLink.isDisplayed());
Assert.assertTrue(timeAndReportsPage.meetingsLink.isDisplayed());

    }
}
