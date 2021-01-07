package com.techproed.tests;

import com.techproed.Pages.CrystalkeysHotelsPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D33_CrystalkeysHotel {
    /*
    1.https://qa-environment.crystalkeyhotels.com/ sayfasina gidelim
    2.Cucumber parametre ,cucumber scenario outline ve TestNg framework @Dataprovider kullanarak asagidaki gorevi tamamlayin
   - Login tusuna basin
   - Asagidaki 5 kullanici adi ve sifreyi deneyin ve login olmadigini test edin
   - Manager – Manager
   - Manager1- Manager1
   - Manager2 - Manager2
   - Manager3 - Manager3
   - Manager4 – Manager4
     */


    @Test(dataProvider = "kullanicilar")
    public void loginTest(String isim, String sifre) {

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        CrystalkeysHotelsPage crystalkeysHotelsPage = new CrystalkeysHotelsPage();
        crystalkeysHotelsPage.loginButton.click();
        crystalkeysHotelsPage.userNameTextBox.sendKeys(isim);
        crystalkeysHotelsPage.passwordTextBox.sendKeys(sifre);
        crystalkeysHotelsPage.loginButton2.click();
        Assert.assertTrue(crystalkeysHotelsPage.girilemediYazisi.isDisplayed());
        Driver.closeDriver();
    }

    @DataProvider(name ="kullanicilar")
        public Object[][] kullaniciOlustur () {
            String datalar[][] = {{"Manager", "Manager"}, {"Manager1", "Manager1"}, {"Manager2", "Manager2"}, {"Manager3", "Manager3"}};
            return datalar;

    }
}
