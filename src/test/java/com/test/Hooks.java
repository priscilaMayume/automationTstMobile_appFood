package com.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    private static AppiumDriver<?> driver;

    public static AppiumDriver<?> checkDriver() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            String appPath = System.getProperty("user.dir") + "/src/test/resources/app/qafood.apk";
            capabilities.setCapability("app", appPath);
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.qazandoqafood");
            capabilities.setCapability("appActivity", "com.qazandoqafood.MainActivity");
            capabilities.setCapability("automationName", "uiautomator2");

            driver = new AndroidDriver<>(new URL("http://localhost:4723"), capabilities);
        }
        return driver;
    }

    public static AppiumDriver<?> getDriver(){
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Before
    public void startProject() throws MalformedURLException {
        if (getDriver() != null) {
            getDriver().launchApp();
        } else {
            checkDriver().launchApp();

        }
    }

}
