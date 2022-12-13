package com.bank.testsuite;


import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BankTest extends BaseTest {

    BankManagerLoginPage bankManagerLoginPage;
    @BeforeMethod (alwaysRun = true)
            public void inIt(){bankManagerLoginPage=new BankManagerLoginPage();}
     AddCustomerPage addCustomerPage;
    @BeforeMethod (alwaysRun = true)
    public void inIt1(){addCustomerPage=new AddCustomerPage();}
    OpenAccountPage openAccountPage;
    @BeforeMethod (alwaysRun = true)
    public void inIt2(){openAccountPage=new OpenAccountPage();}
    CustomerLoginPage customerLoginPage;
    @BeforeMethod (alwaysRun = true)
    public void inIt3(){customerLoginPage=new CustomerLoginPage();}
    AccountPage accountPage;
    @BeforeMethod (alwaysRun = true)
    public void inIt4(){accountPage=new AccountPage();}


    @Test (groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {

        bankManagerLoginPage.clickOnBankManager();
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickAddCustomer();
       Assert.assertEquals(addCustomerPage.popUpMessage(),"Customer added successfully with customer id :6");
        addCustomerPage.popUpAccepted();

    }
    @Test (groups = {"smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException{
        Thread.sleep(10000);
        bankManagerLoginPage.clickOnBankManager();
        openAccountPage.clickOnOpenAccount();
        openAccountPage.searchAndSelectCreatedCustomer();
        openAccountPage.selectPoundInCurrency();
        openAccountPage.clickOnProcessButton();
        String expectedText = "Account created successfully with account Number :1016";
        Assert.assertEquals(openAccountPage.getTextFromPopup(),expectedText,"Text Not Matched");
        openAccountPage.clickOnPopup();
    }
    @Test (groups = {"regression"})
    public void customerShouldLoginAndLogoutSuccessfully(){
        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        customerLoginPage.verifyLogoutTab();
       customerLoginPage.userClickOnLogOutButton();
       customerLoginPage.verifyYourNameDisplayed();
}
    @Test (groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully(){
        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        accountPage.userClickOnDeposit();
        accountPage.enterAmountOnAmountField();
        accountPage.clickOnDeposit();
        String expectedMessage =  "Deposit Successful";
        Assert.assertEquals(accountPage.verifyTextMessage("Deposit Successful"),expectedMessage);

}
    @Test (groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully(){
        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        accountPage.userClickOnWithDrawl();
        accountPage.enterAmountOnAmountField();
        accountPage.userClickOnAmountToBeWithDrawn50();
        accountPage.userClickOnWithdrawButton();
        String expectedMessage = "Transaction Failed. You can not withdraw amount more than the balance.";
        Assert.assertEquals(accountPage.verifyTransactionMessage(),expectedMessage,"Message Not Matched");


    }

}
