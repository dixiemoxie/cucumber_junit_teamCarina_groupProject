package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public abstract class BasePage {


    protected JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

    protected Actions action = new Actions(Driver.getDriver());

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='menu-item-link-text']")
    public List<WebElement> listOfElementsOnLeftSideOfPage;

    @FindBy(xpath = "//span[contains(text(),'Activity Stream')]")
    public WebElement btn_activityStream;

    @FindBy(xpath = "//span[contains(text(),'Tasks')]")
    public WebElement btn_tasks;

    @FindBy(xpath = "//span[contains(text(),'Chat and Calls')]")
    public WebElement btn_chatAndCalls;

    @FindBy(xpath = "//span[contains(text(),'Workgroups')]")
    public WebElement btn_workgroups;

    @FindBy(xpath = "//span[contains(text(),'Drive')]")
    public WebElement btn_drive;

    @FindBy(xpath = "//span[contains(text(),'Calender')]")
    public WebElement btn_calender;

    @FindBy(xpath = "//span[contains(text(),'Mail')]")
    public WebElement btn_mail;

    @FindBy(xpath = "//span[contains(text(),'Contact Center')]")
    public WebElement btn_contactCenter;

    @FindBy(xpath = "//span[contains(text(),'Time and Reports')]")
    public WebElement btn_timeAndReports;

    @FindBy(xpath = "//span[contains(text(),'Employees')]")
    public WebElement btn_employees;

    @FindBy(xpath = "//span[contains(text(),'Services')]")
    public WebElement btn_services;

    @FindBy(xpath = "//span[contains(text(),'Company')]")
    public WebElement btn_company;

    @FindBy(xpath = "//span[contains(text(),'More...')]")
    public WebElement btn_more;

    @FindBy(xpath = "//span[contains(text(),'Configure menu')]")
    public WebElement btn_configureMenu;

    @FindBy(xpath = "//span[contains(text(),'Tasks')]")
    public WebElement btn_up;

    @FindBy(xpath = "//span[contains(text(),'Applications')]")
    public WebElement btn_applicationsHidden;

    @FindBy(xpath = "//span[contains(text(),'Workflows')]")
    public WebElement btn_workflowsHidden;

    @FindBy(xpath = "//span[contains(text(),'Hide')]")
    public WebElement btn_hideHidden;

    @FindBy(xpath = "//span[@class='feed-up-text']")
    public WebElement activityStream;

    @FindBy(xpath = "//a[@href='https://itunes.apple.com/app/bitrix24/id561683423']")
    public WebElement link_mobileApplicationAppStore;

    @FindBy(xpath = "(//a[@href='https://play.google.com/store/apps/details?id=com.bitrix24.android'])[2]")
    public WebElement link_mobileApplicationGooglePlay;

    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement userProfileBtn;

    @FindBy(xpath = "//span[contains(text(), 'My Profile')]")
    public WebElement myProfileLink;


    public void clickOptionsOnLeft(String text) {

        Driver.getDriver().findElement(By.xpath("//span[contains(text(),' " + text + " ')]")).click();
    }

    public void exposeAndClickHiddenOptionsOnLeft(String text) {

        clickOptionsOnLeft("More...");
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),' " + text + " ')]")).click();
    }

    public void scrollToElement(WebElement element) {

        action.scrollToElement(element).perform();
    }


}
