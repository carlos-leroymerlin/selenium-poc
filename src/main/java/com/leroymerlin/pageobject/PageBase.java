package com.leroymerlin.pageobject;

import com.leroymerlin.pageobject.helpers.Clickable;
import com.leroymerlin.pageobject.helpers.Fillable;
import com.leroymerlin.pageobject.helpers.PageContainer;
import com.leroymerlin.pageobject.helpers.Waitable;
import org.openqa.selenium.WebDriver;

public class PageBase implements PageContainer, Waitable, Fillable, Clickable {

    protected WebDriver driver;

    protected PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
