package io.webdriver.chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
    public static void main(String[] args) {
        if (System.getProperty("os.name").contains("Mac OS X"))
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
        else
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        System.out.println(driver.toString());

        if (driver != null)
            driver.quit();
    }
}
