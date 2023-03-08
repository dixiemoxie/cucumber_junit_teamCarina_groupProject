package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B28G11_86_TimeAndReportsPage {
    public B28G11_86_TimeAndReportsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath="//span[.='Absence Chart']")
    public WebElement absenceChartLink;

    @FindBy (xpath="//span[.='Worktime']")
    public WebElement workTimeLink;

    @FindBy (xpath="//span[.='Bitrix24.Time']")
    public WebElement bitrixLink;

    @FindBy (xpath="//span[.='Work Reports']")
    public WebElement workReportsLink;

    @FindBy (xpath = "//span[.='Meetings and Briefings']")
    public  WebElement meetingsLink;


}
