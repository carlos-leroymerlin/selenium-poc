package com.leroymerlin.stepdefinition;

import com.leroymerlin.cucumber.TestContext;
import com.leroymerlin.pageobject.InventoryPage;
import io.cucumber.java.en.Then;

public class InventorySteps {

    private final InventoryPage inventoryPage;

    public InventorySteps(TestContext testContext) {
        inventoryPage = testContext.getPageObjectManager().getInventoryPage();
    }

    @Then("I verify I logged in")
    public void iVerifyILoggedIn() {
        inventoryPage.isVisible();
    }
}
