package io.webdriver.chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        System.out.println(driver.toString());
    }
}
