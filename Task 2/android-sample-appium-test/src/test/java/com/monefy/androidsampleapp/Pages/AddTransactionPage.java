package com.monefy.androidsampleapp.Pages;

import com.monefy.androidsampleapp.Navigation.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class AddTransactionPage extends BasePage {

    @AndroidFindBy(id = "buttonKeyboard0")
    private MobileElement zeroButton;

    @AndroidFindBy(id = "buttonKeyboard1")
    private MobileElement oneButton;

    @AndroidFindBy(id = "buttonKeyboard2")
    private MobileElement twoButton;

    @AndroidFindBy(id = "buttonKeyboard5")
    private MobileElement fiveButton;

    @AndroidFindBy(id = "buttonKeyboardEquals")
    private MobileElement equalsButton;

    @AndroidFindBy(id = "buttonKeyboardPlus")
    private MobileElement plusButton;

    @AndroidFindBy(id = "textViewChooseCategory")
    private MobileElement textViewChooseCategory;

    @AndroidFindBy(id = "button_amount_container")
    private MobileElement amountContainerButton;

    @AndroidFindBy(id = "textViewNote")
    private MobileElement transactionNote;

    @AndroidFindBy(xpath = "//*[@resource-id='com.monefy.app.lite:id/textCategoryName' and @text='Bills']")
    private MobileElement billsCategory;

    @AndroidFindBy(xpath = "//*[@resource-id='com.monefy.app.lite:id/textCategoryName' and @text='Deposits']")
    private MobileElement depositsCategory;

    public AddTransactionPage(AndroidDriver driver) {
        super(driver);
    }

    public void press150Amount() {
        click(oneButton);
        click(fiveButton);
        click(zeroButton);
    }

    public void press250Amount() {
        click(twoButton);
        click(fiveButton);
        click(zeroButton);
    }

    public void pressPlusButton() {
        click(plusButton);
    }

    public void pressEqualsButton() {
        click(equalsButton);
    }

    public void pressChooseCategoryButton() {
        click(textViewChooseCategory);
    }

    public void pressBillsCategory() {
        click(billsCategory);
    }

    public void pressDepositsCategory() {
        click(depositsCategory);
    }

    public void pressAmountContainerButton() {
        click(amountContainerButton);
    }

    public void addTransactionNote(String note) {
        type(transactionNote, note);
    }
}
