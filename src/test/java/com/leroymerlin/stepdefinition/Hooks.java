package com.leroymerlin.stepdefinition;

import com.leroymerlin.cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private final TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before()
    public void beforeStep() {
        System.out.println("START TEST");
    }

    @After()
    public void afterStep() {
        testContext.getPlaywrightManager().quitDriver();
        System.out.println("FINISH TEST");
    }
}
