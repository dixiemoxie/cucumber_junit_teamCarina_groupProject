package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_JM extends BasePage{

    public LoginPage_JM() {

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement txt_Login;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement txt_Password;

    @FindBy(xpath = "//label[text()='Remember me on this computer']")
    public WebElement rememberMeText;

    @FindBy(xpath = "//input[@name='USER_REMEMBER']")
    public WebElement checkbox_rememberMe;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement btn_LogIn;

    @FindBy(xpath = "//input[@name='USER_REMEMBER']")
    public WebElement link_forgotPassword;

    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement authorizationText;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement incorrectLoginText;


    public void logIn(String username, String password) {

        txt_Login.sendKeys(username);
        txt_Password.sendKeys(password);
        btn_LogIn.click();
    }



}
