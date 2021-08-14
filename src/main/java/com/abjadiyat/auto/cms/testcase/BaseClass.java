package com.abjadiyat.auto.cms.testcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class BaseClass {

    public static WebDriver webDriver;
    public static final String baseUrl = "https://cms-dev.abjadiyat.com/";
    protected String username = "562938313";
    protected List<String> password = Arrays.asList("9", "9", "0", "8");


    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        webDriver = new ChromeDriver();
    }

    @AfterClass
    public static void packUp() {
        webDriver.quit();
    }
}