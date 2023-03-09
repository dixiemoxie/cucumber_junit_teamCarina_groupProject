package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B28G11_81_homePage {

    public B28G11_81_homePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement userProfile;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement myProfile;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement editProfileSettings;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[3]")
    public WebElement themes;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[4]")
    public WebElement configureNotifications;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement logOut;



}
