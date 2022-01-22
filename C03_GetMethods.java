package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {

    //1. Yeni bir package olusturalim : day01
    //2. Yeni bir class olusturalim : C01_GetMethods

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        String ararnanKelime = "Amazon";

        if (actualTitle.contains(ararnanKelime)) {
            System.out.println("Title testi PASS");
        } else {
            System.out.println("Title testi FAILED");
            System.out.println("Sayfanin Title'i : " + actualTitle);
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String urlArananKelime = "amazon";

        if (actualTitle.contains(urlArananKelime)) {
            System.out.println("Url testi PASS");
            System.out.println("Url testi FAİLED");
            System.out.println("Actual url: " + actualUrl);
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String actualPageSource = driver.getPageSource();
        String pageArananKelime = "alisveris";
        if (actualTitle.contains(ararnanKelime)) {
            System.out.println("page source testi PASS");
        } else {
            System.out.println("page source testi FAILED");
            System.out.println("Actual url : " + actualUrl);
            //10. Sayfayi kapatin.
            driver.close();
        }
    }
}



