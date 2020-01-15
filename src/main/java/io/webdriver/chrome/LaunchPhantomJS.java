package io.webdriver.chrome;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class LaunchPhantomJS {
    public static void main(String[] args) {
        if (System.getProperty("os.name").contains("Mac OS X"))
            System.setProperty("phantomjs.binary.path", System.getProperty("user.dir") + "/driver/phantomjs");
        else
            System.setProperty("phantomjs.binary.path", System.getProperty("user.dir") + "\\driver\\phantomjs.exe");

        PhantomJSDriver driver = new PhantomJSDriver();
        System.out.println(driver.toString());

        if (driver != null)
            driver.quit();
    }
}
