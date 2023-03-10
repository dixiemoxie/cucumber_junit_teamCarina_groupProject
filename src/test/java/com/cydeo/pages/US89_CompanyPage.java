package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US89_CompanyPage {

    public US89_CompanyPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//a[@title='Company']")
    public WebElement CompanyButton;

    @FindBy (xpath = "//div[@id='top_menu_id_about_3022125719']/a")
    public WebElement OfficialInformationButton;

    @FindBy (xpath = "//div[@id='top_menu_id_about_4237431424']/a")
    public WebElement OurLifeButton;

    @FindBy (xpath = "//div[@id='top_menu_id_about_4184306755']/a")
    public WebElement AboutCompanyButton;

    @FindBy (xpath = "//div[@id='top_menu_id_about_3640681857']/a")
    public WebElement PhotoGalleryButton;

    @FindBy (xpath = "//div[@id='top_menu_id_about_2929033797']/a")
    public WebElement VideoButton;

    @FindBy (xpath = "//div[@id='top_menu_id_about_1740701591']/a")
    public WebElement BusinessNewsButton;

    @FindBy (xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> listOfElements;


    public List<String> getTextOfElementList (){

        List<String> list = new ArrayList<>();

        for (WebElement eachElement : listOfElements){

           list.add(eachElement.getText()) ;
        }

        return list;
    }



}
