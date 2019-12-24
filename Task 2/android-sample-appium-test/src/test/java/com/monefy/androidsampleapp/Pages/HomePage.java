package com.monefy.androidsampleapp.Pages;

import com.monefy.androidsampleapp.Navigation.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;


public class HomePage extends BasePage {

    @AndroidFindBy(id = "expense_button")
    private MobileElement expenseButton;

    @AndroidFindBy(id = "expense_amount_text")
    private MobileElement expenseAmountText;

    @AndroidFindBy(id = "income_button")
    private MobileElement incomeButton;

    @AndroidFindBy(id = "income_amount_text")
    private MobileElement incomeAmountText;

    @AndroidFindBy(id = "balance_amount")
    private MobileElement balanceAmountText;

    @AndroidFindBy(id = "balance_container")
    private MobileElement balanceContainer;

    @AndroidFindBy(xpath = "//*[@resource-id='com.monefy.app.lite:id/transaction_group_header' and @index=0]")
    private MobileElement firstTransactionCategory;

    @AndroidFindBy(xpath = "//*[@resource-id='com.monefy.app.lite:id/textViewTransactionNote' and @text='Temporal transaction']")
    private MobileElement temporalTransaction;

    @AndroidFindBy(id = "delete")
    private MobileElement deleteTransactionButton;

    @AndroidFindBy(id = "overflow")
    private MobileElement menuButton;

    @AndroidFindBy(id = "transfer_menu_item")
    private MobileElement transferButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation']")
    private MobileElement filterButton;

    @AndroidFindBy(id = "account_spinner")
    private MobileElement accountSpinner;

    @AndroidFindBy(xpath = "//*[@resource-id='com.monefy.app.lite:id/title' and @text='All accounts']")
    private MobileElement allAccountsOption;

    @AndroidFindBy(xpath = "//*[@resource-id='com.monefy.app.lite:id/title' and @text='Cash']")
    private MobileElement cashOption;

    @AndroidFindBy(xpath = "//*[@resource-id='com.monefy.app.lite:id/title' and @text='Payment card']")
    private MobileElement paymentCardOption;

    @AndroidFindBy(id = "day_period_button")
    private MobileElement dayPeriodButton;

    @AndroidFindBy(id = "week_period_button")
    private MobileElement weekPeriodButton;

    @AndroidFindBy(id = "month_period_button")
    private MobileElement monthPeriodButton;

    @AndroidFindBy(id = "year_period_button")
    private MobileElement yearPeriodButton;

    @AndroidFindBy(id = "all_period_button")
    private MobileElement allPeriodButton;

    @AndroidFindBy(id = "categories_button")
    private MobileElement categoriesButton;

    @AndroidFindBy(id = "accounts_button")
    private MobileElement accountsButton;

    @AndroidFindBy(id = "currency_button")
    private MobileElement currenciesButton;

    @AndroidFindBy(id = "settings_button")
    private MobileElement settingsButton;

    @AndroidFindBy(id = "snackbar_text")
    private MobileElement snackBarText;

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public void addIncome() {
        click(incomeButton);
    }

    public void addExpense() {
        click(expenseButton);
    }

    public void openMenu() {
        click(menuButton);
    }

    public void openTransfersView() {
        click(transferButton);
    }

    public void openFilterView() {
        click(filterButton);
    }

    public void openAccountsSpinner() {
        click(accountSpinner);
    }

    public void selectAllAccountsOption() {
        click(allAccountsOption);
    }

    public void selectCashOption() {
        click(cashOption);
    }

    public void selectPaymentCardOption() {
        click(paymentCardOption);
    }

    public void selectDayPeriodFilter() {
        click(dayPeriodButton);
    }

    public void selectWeekPeriodFilter() {
        click(weekPeriodButton);
    }

    public void selectMonthPeriodFilter() {
        click(monthPeriodButton);
    }

    public void selectYearPeriodFilter() {
        click(yearPeriodButton);
    }

    public void selectAllPeriodFilter() {
        click(allPeriodButton);
    }

    public void openCategoriesMenu() {
        click(categoriesButton);
    }

    public void openAccountsMenu() {
        click(accountsButton);
    }

    public void openCurrenciesMenu() {
        click(currenciesButton);
    }

    public void openSettingsMenu() {
        click(settingsButton);
    }

    public void toggleBalanceDetails() {
        click(balanceContainer);
    }

    public void openFirstTransactionCategory() {
        click(firstTransactionCategory);
    }

    public void selectTemporalTransaction() {
        click(temporalTransaction);
    }

    public void deleteTransaction() {
        click(deleteTransactionButton);
    }

    public void checkIncome(String income) {
        Assert.assertEquals(incomeAmountText.getText(),
                income,
                "Check result corresponds to actual income");
    }

    public void checkExpense(String expense) {
        Assert.assertEquals(expenseAmountText.getText(),
                expense,
                "Check result corresponds to actual expense");
    }

    public void checkBalance(String balance) {
        Assert.assertEquals(balanceAmountText.getText(),
                balance,
                "Check result corresponds to actual balance");
    }

    public void checkSnackBarText(String text) {
        Assert.assertEquals(snackBarText.getText(),
                text,
                "Text matches");
    }

    public void backToHomePage() {
        back();
    }

}