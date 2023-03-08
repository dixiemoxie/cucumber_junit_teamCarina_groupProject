package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US83Page extends BasePage {

    public US83Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//a[@title='Chat and Calls']")
        public WebElement chatAndCallsModule;

    @FindBy(xpath = "//span[@class='bx-desktop-tab-counter']")
    public List<WebElement> listOfModulesMenu;


        @FindBy(id="bx-desktop-tab-im")
        public WebElement msgBtn;

        @FindBy(id = "bx-desktop-tab-notify")
        public WebElement notificationsBtn;

        @FindBy(id = "bx-desktop-tab-config")
        public WebElement settingsBtn;

        @FindBy(id = "bx-desktop-tab-im-lf")
        public WebElement activityStreamBtn;





    }
