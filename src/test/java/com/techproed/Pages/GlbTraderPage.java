package com.techproed.Pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlbTraderPage {
    public GlbTraderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Join Now")
    public WebElement joinButton;

    @FindBy(xpath ="(//input[@class='form-control'])[1]")
    public  WebElement emailTextBox;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement phoneTextBox;

    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//input[@class='form-control'])[5]")
    public WebElement passwordTekrarBox;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-warning btn-block']")
    public WebElement signUpButton;

    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement emailTextBoxSignIn;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement passwordTextBoxSignIn;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-warning btn-block']")
    public WebElement loginButton;
}


