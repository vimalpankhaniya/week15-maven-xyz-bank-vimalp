package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;

    public void clickOnOpenAccount() {
        Reporter.log("clickOnOpenAccount"+ openAccount.toString());
        clickOnElement(openAccount);
    }

    @CacheLookup
            @FindBy(id = "userSelect")
    WebElement customerDropdown;

    public void searchAndSelectCreatedCustomer() {
        Reporter.log("searchAndSelectCreatedCustomer", customerDropdown.toString().isEmpty());
        selectByVisibleTextFromDropDown((By) customerDropdown, "Harry Potter");
    }

    @CacheLookup
            @FindBy(id = "currency")
    WebElement currencyDropdown;


    public void selectPoundInCurrency() {
        Reporter.log("selectPoundInCurrency"+ currencyDropdown.toString());
        selectByVisibleTextFromDropDown(currencyDropdown, "Pound");
    }

    @CacheLookup
            @FindBy(xpath = "//button[contains(text(),'Process')]")
        WebElement processButton;
    public void clickOnProcessButton() {
        Reporter.log("clickOnProcessButton"+ processButton.toString());
        clickOnElement(processButton);
    }

    @CacheLookup
            @FindBy(xpath = "//button[normalize-space()='Customers']")
            WebElement customerTab;

    public String getTextFromPopup() {
        return getTextFromAlert();
    }

    public void clickOnPopup() {
        acceptAlert();
    }
}
