package com.techproed.Pages;

import com.techproed.utilities.Driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPage {
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

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "searchDropdownBox")
    public WebElement dropDown;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='a-price-whole']")
    public List<WebElement> tamKisimlar;

    @FindBy(xpath = "//span[@class='a-price-fraction']")
    public List<WebElement> ondalikKisimlar;

    @FindBy(id = "add-to-cart-button")
    public WebElement sepeteEkle;

    @FindBy(id = "nav-cart-count")
    public WebElement sepet;

    @FindBy(id = "attach-close_sideSheet-link")
    public WebElement cikis;

    @FindBy(xpath = "//img[@class='sc-product-image']")
    public WebElement seciliUrun;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucTestYazisi;
}
