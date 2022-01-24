package com.appiumTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public class BaseTest {

    public static WebDriver createChromeAndroidDriver(String browserVersion,
                                               String deviceName, URL appiumServerUrl) {
        // Resolve driver and get its path
        WebDriverManager wdm = WebDriverManager.chromedriver()
                .browserVersion(browserVersion);
        wdm.setup();
        String chromedriverPath = wdm.getDownloadedDriverPath();

        // Create WebDriver instance using the driver path
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability("chromedriverExecutable", chromedriverPath);
        capabilities.setCapability("w3c", false);

        return new AndroidDriver<WebElement>(appiumServerUrl, capabilities);
    }
}
