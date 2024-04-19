package com.leroymerlin.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends PageBase {

    private static final By SHOPPING_CART_BTN = By.xpath("//*[@data-icon='shopping-cart']");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void isVisible() {
        waitUntilElementIsVisible(SHOPPING_CART_BTN);
    }

}
