package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement BankManagerLogin;

    public void clickOnBankManager() {
        mouseHoverToElementAndClick(BankManagerLogin);

    }

    public void verifyElement(String expectedMessage, String actualMessage, String notification) {

    }
}
