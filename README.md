# Monefy Test Plan

Monefy is a financial application that lets users manage their finances using mobile phones and gives them the ability to synchronize their expenditure and savings on their favourite cloud storages like Google Drive or Dropbox. 

Key features which make tracking enjoyable and powerful:

1. Intuitive and easy to use user interface. No redundancy
2. Add new records extremely fast
3. See your spending distribution on the nice and informative chart or get detailed information from the records list
4. Multi-currency support
5. Manage categories if defaults do not work for you
6. Be safely synchronized using your own Google Drive or Dropbox account
7. Choose the report period
8. Track recurring records easily
9. Passcode protection
10. Multiple accounts support
11. Built-in calculator
12. No ads

## Feature TF00 - App installation	

### Feature TF00TC001 - App successful installation	
==============

Explore app installation 
With iOS mobile phone
To discover if app could be installed successfully
Time: 5m
Priority: Critical

Experience: App could be installed, uninstalled and reinstalled successfully in iPhone 6s with iOS 13


## Feature TF01 - Tutorial view
	
### Feature TF01TC001 - Tutorial view	
==============

Explore the tutorial flow
With the app installed in a iOS mobile phone
To discover if instructions could be followed as indicated
Time: 10m
Priority: Medium

Experience: I could complete the tutorial in iPhone 6s with iOS 13, based in Colombia. Some findings were reported during this session.

Findings: 
* Some texts are not being translated to local language and remains in English, specifically the "Future recording records option" in the menu, the currency change notification, "Base currency has been changed" and the text displayed in the recurring record, "Recurring records are now available in Monefy Pro!".
* The label with the text "La moneda principal se puede cambiar aquí" it's not moving where currency option is moving.
* Experience could be improved if the flow starts with currency selection so that the fist information a user enters into the app is actually meaningful. If the user enters a value converted to EUR and then changes the base currency, the user will need to manually edit the first register. A location service could help to suggest an initial currency. 


## Feature TF02 - Home Screen
	
### Feature TF02TC001 - Home screen navigation
==============

Explore the home screen navigation
With the app installed in an iOS mobile phone and interacting with the user interface
To discover if navigation makes sense
Time: 20m
Priority: Critical

Experience: The navigation through the Home screen was found consistent and made sense. All options have a cancel button to go back or an intuitive way to touch an element of the screen to go back to the home screen. All transitions go to a view related to the pressed icon.

### Feature TF02TC002 - Home screen update
==============

Explore the home screen navigation
With the app installed in an iOS mobile phone and doing some transactions with different data
To discover that the Home screen is updated accordingly
Time: 20m
Priority: Critical

Experience: When adding new incomes and expenses for actual categories, percentages are being updated by every change as well as the pie chart and the balance. I cannot add new categories in iOS since it's a feature of Monefy Pro. There is an improvement related to Monefy Pro in this flow. Income and expense representation limits during the exploration were found. Representation limits are nine digits and two decimal digits to represent any value.

Findings:
* While attempting to create a new category tapping the plus button, the app allows you to give a name and choose an icon for the new category but will navigate to the Monefy Pro purchase view. The app should send you to the Monefy Pro purchase view when pressing the plus button to avoid the discomfort of interrupting a process you were allowed to do.
* The Schedule record view is not being translated. After configuring the recurrent record and press add button, it will navigate to the Monefy Pro purchase view. The app should send you to the Monefy Pro purchase view when pressing the add button to avoid the discomfort of interrupting a process you were allowed to do.

## Feature TF03 - Transaction list
	
### Feature TF03TC001 - Transaction list navigation
==============

Explore the transaction list navigation
With the app installed in an iOS mobile phone and editing, creating or removing transactions
To discover if the transaction list navigation is updated and it makes sense
Time: 20m
Priority: Critical

Experience: The navigation through the transaction screen was found consistent and made sense. Transactions within the same date range are grouped by category, and descriptions are displayed aside from the amount. Transactions could be deleted, and the transaction list is edited accordingly. Transactions could be fully edited by amount, description, date, and category.


## Feature TF04 - Date filter
	
### Feature TF04TC001 - Date filter navigation
==============

Explore the date navigation
With the app installed in an iOS mobile phone and changing between accounts
To discover if navigation makes sense
Time: 20m
Priority: High

Experience: The navigation through the filter screen was found consistent and made sense. When a date with no data is selected, a toast appears indicating that there are no transactions for that day. Filters seem to be centered on the chosen day or today as default. This functionality works perfectly for day, week, month, and year, but it makes no sense to add the "all" filter to a selected day since it would return the same information every time.


## Feature TF05 - Transfers
	
### Feature TF05TC001 - Transfer view
==============

Explore the transfer
With the app installed in an iOS mobile phone and changing between accounts
To discover if transfer result is consistent
Time: 15m
Priority: High

Experience: The view of transfer is OK. The results of transfers are being updated on the home screen and the transaction list. A toast is shown every time the sender and receiver account are the same. Transfer representation limits during the exploration were found. Representation limits are nine digits and two decimal digits to represent any value.


## Feature TF06 - Categories
	
### Feature TF06TC001 - Categories navigation
==============

Explore the categories list and navigate
With the app installed in an iOS mobile phone and changing between accounts
To discover if the categories list and navigation makes sense
Time: 15m
Priority: Medium

Experience: The categories list is OK. When the plus button is pressed the app sends you to the Monefy Pro purchase view (This is the expected behavior described in the findings of TF02TC002). However, this behavior is not symmetrical; I am unable to create or edit categories, but I am allowed to delete them. Please refer to the findings section.

Findings:
* Categories could be deleted but could not be created or edited. This means that a user could not recover a an original category after being deleted in the normal Monefy app. This could only be done in Monefy Pro
* The text of the pop-up displayed when deleting a category, "Are you sure? All associated records will be removed. You can merge or disable ir instead", is not being transalted to the local language.

## Feature TF07 - Accounts
	
### Feature TF07TC001 - Accounts navigation
==============

Explore the accounts list and navigate
With the app installed in an iOS mobile phone and changing states of the accounts
To discover if the accounts list and navigation makes sense
Time: 15m
Priority: Medium

Experience: The accounts list is OK. When the plus button is pressed a view for account creation is displayed. Accounts could be created, edited, disabled, merged and deleted.

Findings:
* The text of the pop-up displayed when deleting an account, "Are you sure? All associated records will be removed. You can merge or disable ir instead", is not being transalted to the local language.

## Feature TF08 - Settings navigation
	
### Feature TF08TC001 - Balance options
==============

Explore the balance options
With the app installed in an iOS mobile phone and validating in the home page
To discover if the balance options and navigation makes sense
Time: 15m
Priority: Medium

Experience: When selecting budget mode, a value is set, but cannot evidence what this configuration does. Carry-over option works, adding the difference of the income and expense of last month to the next one. It cannot attest to what future recurring records do. I assume this feature is related to scheduled records, that are only available in Monefy Pro.

Findings:
* For budget mode, it should alert if the budget is about to be reached or if it was exceeded.

### Feature TF08TC002 - General settings options
==============

Explore the general settings options
With the app installed in an iOS mobile phone and validating in the home page
To discover if the general settings options and navigation makes sense
Time: 15m
Priority: Medium

Experience: The Monefy Pro option is displayed and working. The language and base currency could be changed successfully. The first day of the week and month are validated, checking the home screen, and changed accordingly. The review application button takes you to the App Store. About Monefy, let you disable and enable Google metrics. The export file works, but some findings were found.

Findings:
* Exporting the file shows all the columns on the file in English and some categories were not translated, like InitialBalance, ExpenseTransfer and IncomeTransfer.

### Feature TF08TC003 - Data backup options
==============

Explore the Data backup options
With the app installed in an iOS mobile phone and validating in the home page
To discover if the Data backup options and navigation makes sense
Time: 10m
Priority: Medium

Experience: Create data back up created a .bak file named with the year, month, day and time of the back up. Restore data button allows to use a saved back up. Clear data button allow you to erase every record and piece of information.

# Priority

Testing priority was marked as follows:
* Critical: Functionalities that block the navigation or access to other functionalities and contain the core of the business logic.
* High: Functionalities that add value to the user but will not block the navigation.
* Medium: Nice to have features that will not block the navigation.
* Low: User interface inspection

# Risks mitigation

Data loss - Users' data must be stored and backed up.
Data consistency - Users' data must be accurate and the same in the app as in the backups and exported files.
Compatibility - Test in different iOS and Android devices.
Information protection - Make sure the information is only accessible using the app and exporting. Other apps cannot access this information, and a user without the right passcode cannot access it.