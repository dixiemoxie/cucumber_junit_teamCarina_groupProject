package com.cydeo.step_definitions;

import com.cydeo.pages.US88_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US88_ConfigureMenu_StepDefs {

    US88_homePage us88_homePage = new US88_homePage();
    @When("the user is on the home page")
    public void the_user_is_on_the_home_page() {

    }
    @When("clicks Configure Menu button")
    public void clicks_configure_menu_button() {
      us88_homePage.configureMenu.click();

    }
    @Then("user should see Configure Menu Items")
    public void user_should_see_configure_menu_items() {
        Assert.assertTrue(us88_homePage.configureMenuItems.isDisplayed());

    }
    @Then("user should see Collapse menu")
    public void user_should_see_collapse_menu() {
        Assert.assertTrue(us88_homePage.collapseMenu.isDisplayed());

    }
    @Then("user should see Remove current page from left menu")
    public void user_should_see_remove_current_page_from_left_menu() {
        Assert.assertTrue(us88_homePage.removeCurrentPage.isDisplayed());

    }
    @Then("user should see Add custom menu item")
    public void user_should_see_add_custom_menu_item() {
Assert.assertTrue(us88_homePage.addCustomMenuItem.isDisplayed());
    }
    @Then("user should see Change primary tool")
    public void user_should_see_change_primary_tool() {
        Assert.assertTrue(us88_homePage.changePrimaryTool.isDisplayed());

    }
    @Then("user should see Reset menu")
    public void user_should_see_reset_menu() {
        Assert.assertTrue(us88_homePage.resetMenu.isDisplayed());

    }
}
