package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US84_HomePage extends BasePage {

    public US84_HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement userProfileOptions;

    @FindBy(xpath = "//span[contains(text(), 'My Profile')]")
    public WebElement myProfileLink;
}
