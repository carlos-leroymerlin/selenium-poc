package com.leroymerlin.pageobject.helpers;

import org.openqa.selenium.By;

public interface Fillable extends Waitable {

    default void fillElement(String value, By locator) {
        waitUntilElementIsVisible(locator);
        if (!value.isEmpty()) {
            getDriver().findElement(locator).sendKeys(value);
        }
    }
}
