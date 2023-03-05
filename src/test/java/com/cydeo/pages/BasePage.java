package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

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
    public WebElement btn_contactcenter;

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

    @FindBy(xpath = "//span[@class='feed-up-text']")
    public WebElement activityStream;

    @FindBy(xpath = "//span[contains(text(),'Tasks')]")
    public WebElement btn_up;

    @FindBy(xpath = "//span[contains(text(),'Applications')]")
    public WebElement btn_applicationsHidden;

    @FindBy(xpath = "//span[contains(text(),'Workflows')]")
    public WebElement btn_workflowsHidden;

    @FindBy(xpath = "//span[contains(text(),'Hide')]")
    public WebElement btn_hideHidden;




    public void clickOptionsOnLeft(String text) {

        Driver.getDriver().findElement(By.xpath("//span[contains(text(),' " + text + " ')]")).click();
    }

    public void exposeAndClickHiddenOptionsOnLeft(String text) {

        clickOptionsOnLeft("More...");
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),' " + text + " ')]")).click();
    }


}
