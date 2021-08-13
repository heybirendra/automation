package com.abjadiyat.auto.cms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPageUserPinInputPage {

    private WebDriver webDriver;

    public LoginPageUserPinInputPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(tagName = "input")
    List<WebElement> pinBox;

    @FindBy(className = "MuiButton-label")
    WebElement pinBoxPageButton;

    public void setPin(List<String> pin) {
        for(int i=0;i< pinBox.size();i++ ) {
            pinBox.get(i).sendKeys(pin.get(i));
        }
    }

    public void clickPinBoxPageButton() {
        pinBoxPageButton.click();
    }

}
