package com.monefy.androidsampleapp.Navigation;

import com.monefy.androidsampleapp.Runners.BaseSetup;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends BaseSetup {

    protected final AndroidDriver driver;

    public BasePage(AndroidDriver driver) {

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean isAndroid() {
        return driver.getCapabilities().getCapability("platformName") == "Android";
    }

    public void takeScreenshot() {
        driver.getScreenshotAs(OutputType.BASE64);
    }

    public String getAlertTitle() {
        return driver.findElement(By.id("android:id/alertTitle")).getText();
    }

    public void back() {
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    public void click(MobileElement element) {
        explicitWait(250L);
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void type(MobileElement element, String text) {
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
        driver.hideKeyboard();
    }

    public void explicitWait(Long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Boolean isElementPresent(MobileElement element) {
        Boolean isPresent = element.isEnabled();
        return isPresent;
    }

}
