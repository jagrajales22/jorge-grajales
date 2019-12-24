package com.monefy.androidsampleapp.Pages;

import com.monefy.androidsampleapp.Navigation.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class SettingsPage extends BasePage {

    @AndroidFindBy(id = "com.monefy.app.lite:id/is_night_mode_enabled_checkbox")
    private MobileElement darkThemeCheckBox;

    public SettingsPage(AndroidDriver driver) {
        super(driver);
    }

    public void toggleDarkTheme() {
        click(darkThemeCheckBox);
    }

}
