package com.leroymerlin.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    private static final By USERNAME_FIELD = By.xpath("//*[@data-test='username']");
    private static final By PASSWORD_FIELD = By.xpath("//*[@data-test='password']");
    private static final By LOGIN_BTN = By.xpath("//*[@id='login-button']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoggingPageVisible() {
        waitUntilElementIsVisible(USERNAME_FIELD);
        waitUntilElementIsVisible(PASSWORD_FIELD);
        waitUntilElementIsVisible(LOGIN_BTN);
        return true;
    }

    public void correctLogin(String username) {
        fillElement(username, USERNAME_FIELD);
        fillElement("secret_sauce", PASSWORD_FIELD);
        clickOn(LOGIN_BTN);
    }

}
