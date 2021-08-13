package com.abjadiyat.auto.teacher.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPagePinInputPage extends BasePage {

    private WebDriver webDriver;

    public LoginPagePinInputPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(tagName = "input")
    private List<WebElement> pinInputBox;

    @FindBy(id = "otpSubmit")
    private WebElement btnLogin;

    @FindBy(className = "jss593")
    private WebElement resendCodeLink;

    @FindBy(className = "MuiLink-button")
    private WebElement backLink;

    public void clickLoginButton() {
        btnLogin.click();
    }

    public void clickResendCodeLink() {
        resendCodeLink.click();
    }

    public void setLoginPin(List<String> pin) {
        for(int i = 0; i< pinInputBox.size(); i++ ) {
            pinInputBox.get(i).sendKeys(pin.get(i));
        }
    }
}
