package ders11_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C02_CookieAutomation extends TestBase {

    @Test
    public void cookieTesti(){
        //Yeni bir class olusturun : cookiesAutomation
        //1- Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2- tum cookie’leri listeleyin
        Set<Cookie> cookiesSeti= driver.manage().getCookies();

        int siraNo=1;

        for (Cookie eachCookie: cookiesSeti
             ) {
            System.out.println(siraNo+"- " + eachCookie);
            siraNo++;
        }

        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin

        Assert.assertTrue(cookiesSeti.size()>5);
        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        Cookie i18Cookie=driver.manage().getCookieNamed("i18n-prefs");
        String i18Value=i18Cookie.getValue();
        Assert.assertEquals("USD",i18Value);

        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun
        // ve sayfaya ekleyin



        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        //7- ismi skin olan cookie’yi silin ve silindigini test edin
        //8- tum cookie’leri silin ve silindigini test edin


    }

}
