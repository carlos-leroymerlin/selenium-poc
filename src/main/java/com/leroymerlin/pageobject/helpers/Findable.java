package com.leroymerlin.pageobject.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Findable extends Waitable {

    default WebElement findElement(By locator) {
        waitUntilElementIsVisible(locator);
        return getDriver().findElement(locator);
    }
}
