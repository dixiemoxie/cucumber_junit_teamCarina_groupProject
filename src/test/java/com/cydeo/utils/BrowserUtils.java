package com.cydeo.utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    public static void sleep(int second) {

        second *= 1000;

        try {
            Thread.sleep(second);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void switchWindowAndVerify(String expectedURL, String expectedTitle) {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for(String each : windowHandles) {

            Driver.getDriver().switchTo().window(each);

            if(Driver.getDriver().getCurrentUrl().contains(expectedURL)) {
                break;
            }
        }

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }


    public static void verifyTitleEquals(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void verifyTitleContains(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

    public static void waitForInvisibilityOfGivenElement(WebElement element) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitForVisibilityOfGivenElement(WebElement element, int seconds) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static void waitForTitleContains(String title) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.titleContains(title));
    }

    public static List<String> getOptionsOfSelectDropDown(WebElement monthDropDown) {

        Select select = new Select(monthDropDown);

        // storing all of the actual options into a List of WebElement
        List<WebElement> actualMonths = select.getOptions();

        // Creating an empty List of String to store actual options as a String
        List<String> eachMonthAsString = new ArrayList<>();

        // looping through my List<WebElements> to get the text of each as a String
        // and storing them into my Lis<String>
        for(WebElement eachMonth : actualMonths) {

            eachMonthAsString.add(eachMonth.getText());
        }

        return eachMonthAsString;
    }

    public static void verifyURLEndsWith(String str) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(str));
    }




    public static boolean cellTextDataIsDisplayed (String cellText) {

        boolean isDisplayed = false;

        WebElement element = Driver.getDriver().findElement(By.xpath("//tbody//tr//td[.='" + cellText + "']"));

        if(element.isDisplayed()) {
            isDisplayed = true;
        }

        return isDisplayed;
    }

    public static void hover(WebElement element) {

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(element).perform();
    }

    /**
     * Verifies whether the element is displayed on the page
     *
     * @param element
     * @throws AssertionError if the element is not found or displayed
     */

    public static void verifyElementIsDisplayed(WebElement element) {

        try{
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch(NoSuchElementException e) {

            e.printStackTrace();
            Assert.fail("Element not found: " + element);
        }
    }


    //    public static void clickOnPaymentRadioButton (String attributeValue) {
//
//        CydeoWebTablesOrderPage cydeoWebTablesOrderPage = new CydeoWebTablesOrderPage();
//
//        for(WebElement eachWebElement : cydeoWebTablesOrderPage.cardTypes) {
//
//            if(eachWebElement.getAttribute("value").equalsIgnoreCase(attributeValue)) {
//                eachWebElement.click();
//                break;
//            }
//        }
//    }




}
