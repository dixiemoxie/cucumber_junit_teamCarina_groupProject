package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B28G11_80_86_homePage {
    public B28G11_80_86_homePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy (xpath="//div[.='Desktop client']")
    public WebElement desktopClient;

    @FindBy (xpath="//span[.='Mac OS']")
    public WebElement macOsLink;

    @FindBy (xpath="//span[.='Windows']")
    public  WebElement windowsLink;

    @FindBy (xpath="//span[.='Linux']")
    public WebElement linuxLink;

    @FindBy (xpath="//a[@href=\"/timeman/\"]")
    public WebElement timeAndReportsLink;
}
