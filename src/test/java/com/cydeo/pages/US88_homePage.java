package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US88_homePage {

    public US88_homePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "left-menu-settings")
    public WebElement configureMenu;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement configureMenuItems;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement collapseMenu;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[3]")
    public WebElement removeCurrentPage;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[4]")
    public WebElement addCustomMenuItem;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement changePrimaryTool;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[6]")
    public WebElement resetMenu;


}
