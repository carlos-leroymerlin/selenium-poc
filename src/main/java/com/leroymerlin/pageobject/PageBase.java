package com.leroymerlin.pageobject;

import com.leroymerlin.pageobject.helpers.*;
import org.openqa.selenium.WebDriver;

public class PageBase implements PageContainer, Waitable, Fillable, Clickable, Getable, Findable {

    protected WebDriver driver;

    protected PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
