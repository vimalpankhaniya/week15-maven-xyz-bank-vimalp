package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class CustomerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    public void clickOnCustomerLogin() {
        Reporter.log("clickOnCustomerLogin" + customerLogin.toString());
        clickOnElement(customerLogin);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement clickOnYourName;

    public void userClickOnYourName() {
        Reporter.log("userClickOnYourName" + clickOnYourName.toString());
        clickOnElement(clickOnYourName);
    }

    @CacheLookup
    @FindBy(xpath = "/select[@id='userSelect']/child::*")

    By selectYourNameFromDropDown = By.xpath("//select[@id='userSelect']/child::*");

    public void userSelectYourNameFromDropDown() {
        List<WebElement> names = driver.findElements(selectYourNameFromDropDown);
        selectOptionsFromDropDown(names, "Harry Potter");
    }

    private void selectOptionsFromDropDown(List<WebElement> names, String harry_potter) {
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLoginButton;

    public void userClickOnLoginButton() {
        Reporter.log("userClickOnLoginButton" + clickOnLoginButton.toString());
        clickOnElement(clickOnLoginButton);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement verifyLogoutTab;

    public void verifyLogoutTab() {
        Reporter.log("verifyLogOutTab" + verifyLogoutTab.toString());
        isDisplayedMethod(verifyLogoutTab);
    }

    private void isDisplayedMethod(WebElement verifyLogoutTab) {
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement clickOnLogOutButton;

    public void userClickOnLogOutButton() {
        Reporter.log("userClickOnLogOutButton" + clickOnLogOutButton.toString());
        clickOnElement(clickOnLogOutButton);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
            
    By verifyYourName = By.xpath("//select[@id='userSelect']");

    public void verifyYourNameDisplayed() {
        List<WebElement> names = driver.findElements(verifyYourName);
        selectOptionsFromDropDown(names, "Harry Potter");
    }
}