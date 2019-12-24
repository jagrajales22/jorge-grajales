package com.monefy.androidsampleapp.Navigation;

import com.monefy.androidsampleapp.Pages.AddTransactionPage;
import com.monefy.androidsampleapp.Pages.BecomeProPage;
import com.monefy.androidsampleapp.Pages.HomePage;
import com.monefy.androidsampleapp.Pages.SettingsPage;
import io.appium.java_client.android.AndroidDriver;

public class Monefy {

    private AndroidDriver driver;

    public Monefy(AndroidDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {
        return new HomePage(driver);
    }

    public AddTransactionPage addTransactionPage() {
        return new AddTransactionPage(driver);
    }

    public SettingsPage settingsPage() {
        return new SettingsPage(driver);
    }

    public BecomeProPage becomeProPage() {
        return new BecomeProPage(driver);
    }

}
