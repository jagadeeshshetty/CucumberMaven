package io.webdriver.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class WebDriverInterface {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        System.setProperty("phantomjs.binary.path", System.getProperty("user.dir") + "\\driver\\phantomjs.exe");

        WebDriver driver;

        driver = new ChromeDriver();
        System.out.println(driver.toString());
        driver.quit();

        driver = new PhantomJSDriver();
        System.out.println(driver.toString());
        driver.quit();
    }
}
