package com.monefy.androidsampleapp.Runners;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BaseSetup {


    private static AndroidDriver driver;
    private static final String PLATFORM_NAME = "Android";
    private static final String APP_ACTIVITY = "com.monefy.activities.main.MainActivity_";
    private static final String APP_PACKAGE = "com.monefy.app.lite";
    private static final String DEVICE_NAME = "emulator-5554";
    private static final String LOCAL_HOST = "http://127.0.0.1:4723/wd/hub";
    private static final String PLATFORM_VERSION = "8.1";
    private static final String NEW_COMMAND_TIMEOUT = "120";


    @BeforeSuite
    public void createTestRun() {
        //TODO: Logic for starting a test in a test case management tools comes here
    }

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
        capabilities.setCapability("appPackage", APP_PACKAGE);
        capabilities.setCapability("appActivity", APP_ACTIVITY);
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("newCommandTimeout", NEW_COMMAND_TIMEOUT);
        this.driver = new AndroidDriver(new URL(LOCAL_HOST), capabilities);
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
    }

    public AndroidDriver getAppiumDriver() {
        try {
            setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @AfterSuite
    public void uploadTestResults() {
        //TODO: Logic to finish and upload test results to a test case management tool
    }

}

