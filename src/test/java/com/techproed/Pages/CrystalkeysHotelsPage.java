package com.techproed.Pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrystalkeysHotelsPage {

    public CrystalkeysHotelsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Log in")
    public WebElement loginButton;
    @FindBy(id = "UserName")
    public WebElement userNameTextBox;
    @FindBy(id = "Password")
    public WebElement passwordTextBox;
    @FindBy(id = "btnSubmit")
    public WebElement loginButton2;
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girilemediYazisi;
}
