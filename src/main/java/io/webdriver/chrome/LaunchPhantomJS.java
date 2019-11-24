package io.webdriver.chrome;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class LaunchPhantomJS {
    public static void main(String[] args) {
        System.setProperty("phantomjs.binary.path", System.getProperty("user.dir") + "\\driver\\phantomjs.exe");
        PhantomJSDriver driver = new PhantomJSDriver();
        System.out.println(driver.toString());
    }
}
