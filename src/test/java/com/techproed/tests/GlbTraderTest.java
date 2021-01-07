package com.techproed.tests;

import com.techproed.Pages.GlbTraderPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;
import sun.security.krb5.Config;

public class GlbTraderTest {

    @Test
    public void signUpTest(){
        GlbTraderPage glbTraderPage = new GlbTraderPage();
        Driver.getDriver().get(ConfigReader.getProperty("glbTrader_url"));

        glbTraderPage.joinButton.click();
        glbTraderPage.emailTextBox.sendKeys(ConfigReader.getProperty("email_address"));
        glbTraderPage.nameTextBox.sendKeys(ConfigReader.getProperty("name"));
        glbTraderPage.phoneTextBox.sendKeys(ConfigReader.getProperty("phone_number"));
        glbTraderPage.passwordTextBox.sendKeys(ConfigReader.getProperty("email_password"));
        glbTraderPage.passwordTekrarBox.sendKeys(ConfigReader.getProperty("email_password"));
        glbTraderPage.signUpButton.click();
    }
    @Test
    public void signIn(){
        GlbTraderPage glbTraderPage = new GlbTraderPage();
        Driver.getDriver().get(ConfigReader.getProperty("glbTrader_url"));

        glbTraderPage.signIn.click();
        glbTraderPage.emailTextBoxSignIn.sendKeys(ConfigReader.getProperty("email_address"));
        glbTraderPage.passwordTextBoxSignIn.sendKeys(ConfigReader.getProperty("email_password"));
        glbTraderPage.loginButton.click();
    }
}
