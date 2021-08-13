package com.abjadiyat.auto.teacher.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsernameInputPage extends BasePage {

    private WebDriver webDriver;

    public LoginPageUsernameInputPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "mobileNumber")
    @CacheLookup
    WebElement mobileNumberInputField;

    @FindBy(id = "emailId")
    private WebElement emailInputField;

    @FindBy(id = "login-request")
    WebElement btnLogin;

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumberInputField.sendKeys(mobileNumber);
    }

    public void setEmailId(String email) {
        this.emailInputField.sendKeys(email);
    }

    public void clickLoginButton() {
        btnLogin.click();
    }

}
