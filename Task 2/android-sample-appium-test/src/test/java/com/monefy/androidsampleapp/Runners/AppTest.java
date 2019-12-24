package com.monefy.androidsampleapp.Runners;


import com.monefy.androidsampleapp.Navigation.Monefy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * Monefy happy flow .
 */
public class AppTest extends BaseSetup {

    protected Monefy app;

    @BeforeTest
    public void setUpAndroidSampleApp() {
        app = new Monefy(getAppiumDriver());
    }

    @Test
    public void verifyBalanceAfterAddingTransactions() {

        // Arrange: Precondition
        app.homePage().addIncome();

        //Act: Test flow for adding an income and an expense transaction
        app.addTransactionPage().press250Amount();
        app.addTransactionPage().addTransactionNote("Temporal transaction");
        app.addTransactionPage().pressChooseCategoryButton();
        app.addTransactionPage().pressDepositsCategory();
        app.homePage().checkSnackBarText("Deposits: $250.00 added");

        app.homePage().addExpense();
        app.addTransactionPage().press150Amount();
        app.addTransactionPage().pressChooseCategoryButton();
        app.addTransactionPage().pressBillsCategory();
        app.homePage().checkSnackBarText("Bills: $150.00 added");

        //Assert: Make sure the balance result is the subtraction of incomes and expenses
        app.homePage().checkBalance("Balance $100.00");
    }

    @Test
    public void verifyBalanceAfterDeletingATransaction() {

        // Arrange: Precondition
        app.homePage().toggleBalanceDetails();

        //Act: Test flow deleting a transaction
        app.homePage().openFirstTransactionCategory();
        app.homePage().selectTemporalTransaction();
        app.homePage().deleteTransaction();

        //Assert: Make sure the balance result is the subtraction of incomes and expenses
        app.homePage().checkSnackBarText("Record was deleted");
        app.homePage().checkBalance("Balance -$150.00");
        app.homePage().backToHomePage();
    }

    @Test
    public void verifyDarkThemeSendsToBecomeProPage() {

        // Arrange: Precondition
        app.homePage().openMenu();
        app.homePage().openSettingsMenu();

        //Act: Try to enable dark theme
        app.settingsPage().toggleDarkTheme();

        //Assert: Make sure the Become Pro page is displayed
        app.becomeProPage().isBecomeProPagePresent();
        app.becomeProPage().backToHomePage();
    }

    @Test
    public void verifyTransferIsMade() {
        // Arrange: Precondition
        app.homePage().openTransfersView();

        //Act: Perform a transfer
        app.addTransactionPage().pressAmountContainerButton();
        app.addTransactionPage().press150Amount();
        app.addTransactionPage().pressChooseCategoryButton();

        //Assert: Make sure the snackbar shows the transfer process
        app.homePage().checkSnackBarText("Transfer was added");
    }

    @Test
    public void verifyBalanceForCashAndPaymentCard() {
        // Arrange: Precondition
        app.homePage().openFilterView();

        //Act: Filter per account
        app.homePage().openAccountsSpinner();
        app.homePage().selectCashOption();
        app.homePage().checkBalance("Balance -$150.00");

        app.homePage().openFilterView();
        app.homePage().openAccountsSpinner();
        app.homePage().selectPaymentCardOption();
        app.homePage().checkBalance("Balance $0.00");
    }



}
