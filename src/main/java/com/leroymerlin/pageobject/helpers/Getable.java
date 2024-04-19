package com.leroymerlin.pageobject.helpers;

import org.openqa.selenium.By;

public interface Getable extends Findable {

    default boolean isVisible(By locator) {
        return findElement(locator).isDisplayed();
    }
}
