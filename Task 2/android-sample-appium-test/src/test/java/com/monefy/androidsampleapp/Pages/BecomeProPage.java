package com.monefy.androidsampleapp.Pages;

import com.monefy.androidsampleapp.Navigation.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class BecomeProPage extends BasePage {

    @AndroidFindBy(id = "com.monefy.app.lite:id/monefyProTitle")
    private MobileElement becomeProTitle;

    public BecomeProPage(AndroidDriver driver) {
        super(driver);
    }

    public void isBecomeProPagePresent() {
        Assert.assertTrue(isElementPresent(becomeProTitle), "Become Pro page is being displayed");
    }

    public void backToHomePage() {
        back();
        back();
    }
}
