package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='borderM box padT20 ng-scope']/div[3]/button[2]")
    WebElement clickOnDeposit;


    public void userClickOnDeposit() {
        clickOnElement(clickOnDeposit);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountToBeDeposited;

    public void enterAmountOnAmountField() {
        sendTextToElement(amountToBeDeposited, "100");
    }

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement deposit;

    public void clickOnDeposit() {
        clickOnElement(deposit);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyText;


    public String verifyTextMessage(String text) {
        return getTextFromElement(verifyText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement clickOnWithDrawl;

    public void userClickOnWithDrawl() {
        clickOnElement(clickOnWithDrawl);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement clickOnAmountToBeWitthdrawn;


    public void userClickOnAmountField() {
        clickOnElement(clickOnAmountToBeWitthdrawn);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawAmount;

    public void userClickOnAmountToBeWithDrawn50() {
        sendTextToElement(withdrawAmount, "50");
    }


    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnWithdrawButton;

    public void userClickOnWithdrawButton() {
        clickOnElement(clickOnWithdrawButton);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyTransactionMessage;


    public String verifyTransactionMessage() {
        return getTextFromElement(verifyTransactionMessage);

    }
}

