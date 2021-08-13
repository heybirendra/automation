package com.abjadiyat.auto.cms.testcase;

import com.abjadiyat.auto.cms.page.LoginPageUserIdInputPage;
import com.abjadiyat.auto.cms.page.LoginPageUserPinInputPage;
import org.junit.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException {
        webDriver.get(baseUrl);
        LoginPageUserIdInputPage lp = new LoginPageUserIdInputPage(webDriver);
        lp.setUserName(username);
        lp.clickButton();

        LoginPageUserPinInputPage pinPage = new LoginPageUserPinInputPage(webDriver);
        pinPage.setPin(password);
        pinPage.clickPinBoxPageButton();
        Thread.sleep(10000);

    }
}
