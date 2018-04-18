package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    private static WebDriver driver;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "./browserServers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

    public static WebDriver getDriver() {
        return driver;
    }

    public static void navigateToUrl(){
        getDriver().navigate().to("https://digital1.bgdigitaltest.co.uk/");
    }

}

