package com.abjadiyat.auto.teacher.page;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class BasePage {

    public static WebDriver webDriver;
    public static final String baseUrl = "https://teachers-dev.abjadiyat.com";
    protected String username = "t3@abjad.dev";
    protected List<String> password = Arrays.asList("0", "1", "4", "6");


    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/b.mishra/Downloads/chromedriver");
        webDriver = new ChromeDriver();
    }

    @AfterClass
    public static void packUp() {
        webDriver.quit();
    }
}
