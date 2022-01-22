package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_YoutubeTesti {

    //1) Bir class oluşturun: YoutubeAssertions
    //2) https://www.youtube.com adresine gidin
    //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    //    ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    //    ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //     ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //    ○ wrongTitleTest  => Sayfa basliginin “youtube” olmadigini dogrulayin

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @Test
    public void titleTesti(){
        //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
        driver.get("https://www.bestbuy.com/");
        //		○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.bestbuy.com/";
        Assert.assertEquals("Ltfen test degerlerini gozden gecirin", expectedURL, actualURL);
    }
   @Test
    public void imageTest(){

   }
    @Test
    public void searchBoxTest(){

    }
    @Test
    public void wrongTitleTest(){

    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }
}
