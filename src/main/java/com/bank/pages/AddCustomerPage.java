package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;

    public void clickOnAddCustomer() {
        clickOnElement(addCustomerTab);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    public void enterFirstName() {
        sendTextToElement(firstName, "Vimal");
    }

    @CacheLookup
            @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    public void enterLastName() {
        sendTextToElement(lastName, "Pankhaniya");
    }
    @CacheLookup
            @FindBy(xpath = "//input[@placeholder='Post Code']")
        WebElement postCode;
    public void enterPostCode() {
        sendTextToElement(postCode, "NW9 0PY");
    }
    @CacheLookup
            @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomer;

    public void clickAddCustomer() {
        clickOnElement(addCustomer);
    }
    public void popUpAccepted() {
        driver.switchTo().alert().accept();
    }
    public String popUpMessage() {
        return getTextFromAlert();
    }
}

