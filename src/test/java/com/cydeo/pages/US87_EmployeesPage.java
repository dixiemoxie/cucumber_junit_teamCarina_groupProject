package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US87_EmployeesPage extends BasePage{

    public US87_EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='main-buttons-inner-container']/div[@data-top-menu-id='top_menu_id_company']")
    public List<WebElement> topMenuModules;

}
