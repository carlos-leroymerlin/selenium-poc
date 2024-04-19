package com.leroymerlin.pageobject.helpers;

import org.openqa.selenium.By;

public interface Clickable extends Waitable {

    default void clickOn(By locator) {
        waitUntilElementIsVisible(locator);
        getDriver().findElement(locator).click();
    }
}
