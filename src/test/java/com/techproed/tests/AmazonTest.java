package com.techproed.tests;

import com.techproed.Pages.AmazonPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonTest {
      /*
amazon' a gidelim
Linki Config Reader dan alalım
Başlığın "Electronics" içerip içermediğini kontrol edelim
All Categories ' e gidelim
"Toys & Games" ı seçelim
Arama kelimesini config reader dan alalım
Arama kutusuna toy story yazdıralım-- Config reader dan alalım
İlk sayfadaki bütün fiyatları listeleyip yazdıralım en düşük ve en yüksek fiyatı bulalım
Herhangi bir  ürünü önce tıklayıp sonra sepete ekleyelim.
Sepete gidip seçimi yapıp yapamadığımızı assert edelim.
Çıkan tüm sonuçları yazdıralım
​
 */
    @Test
    public void amazonTest() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        AmazonPage amazonPage= new AmazonPage();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty("title_aranan_kelime")));

        Select select = new Select(amazonPage.dropDown);
        select.selectByVisibleText(ConfigReader.getProperty("arama_secenegi"));

        amazonPage.searchBox.sendKeys(ConfigReader.getProperty("aranan_kelime")+ Keys.ENTER);

        List<Double> fiyatListesi=new ArrayList<>();

        int urunSayisi=amazonPage.ondalikKisimlar.size();

        for (int i=0; i<urunSayisi; i++){
            if (!amazonPage.tamKisimlar.get(i).getText().isEmpty()){
                fiyatListesi.add(Double.valueOf(amazonPage.tamKisimlar.get(i).getText()+"."+amazonPage.ondalikKisimlar.get(i).getText()));
            }
        }
        System.out.println();
        System.out.println("Siralanmamis Liste:" +fiyatListesi);

        Collections.sort(fiyatListesi);
        System.out.println("Siralanmamis Liste:" +fiyatListesi);

        System.out.println("En dusuk fiyat: "+ fiyatListesi.get(1));
        System.out.println("En yuksek fiyat: "+ fiyatListesi.get(fiyatListesi.size()-1));

        amazonPage.tamKisimlar.get(0).click();

        amazonPage.sepeteEkle.click();
        Thread.sleep(3_000);
        amazonPage.cikis.click();
        amazonPage.sepet.click();
        Thread.sleep(3_000);
        softAssert.assertTrue(amazonPage.seciliUrun.isDisplayed());

        softAssert.assertAll();

        Driver.closeDriver();
    }
}
