package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US84_ProfilePage extends BasePage {

    public US84_ProfilePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='profile-menu-filter']/a")
    public List<WebElement> userProfileOptions;

}
