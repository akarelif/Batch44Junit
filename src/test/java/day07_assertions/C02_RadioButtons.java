package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class C02_RadioButtons {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver();
    }

}
