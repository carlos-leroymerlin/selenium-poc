package com.leroymerlin.cucumber;

import com.leroymerlin.managers.PageObjectManager;
import com.leroymerlin.managers.WebDriverManager;

public class TestContext {

    private final WebDriverManager webdriverManager;
    private final PageObjectManager pageObjectManager;
    private final ScenarioContext scenarioContext;

    public TestContext() {
        webdriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webdriverManager.getDriver());
        scenarioContext = new ScenarioContext();
    }

    public WebDriverManager getPlaywrightManager() {
        return webdriverManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
