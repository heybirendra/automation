package com.abjadiyat.auto.cms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUserIdInputPage {

    private WebDriver webDriver;

    public LoginPageUserIdInputPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(name = "mobileNumber")
    @CacheLookup
    WebElement textMobileNumber;

    @FindBy(className = "MuiButton-label")
    WebElement btnLogin;

    public void setUserName(String username) {
        this.textMobileNumber.sendKeys(username);
    }

    public void clickButton() {
        btnLogin.click();
    }


}
