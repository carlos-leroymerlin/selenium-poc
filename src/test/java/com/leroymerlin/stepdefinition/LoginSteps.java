package com.leroymerlin.stepdefinition;

import com.leroymerlin.cucumber.TestContext;
import com.leroymerlin.pageobject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(TestContext testContext) {
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Given("I am in login page")
    public void iAmInLoginPage() {
        Assertions.assertTrue(loginPage.isLoggingPageVisible());
    }

    @When("^I introduce (.*) and correct password$")
    public void iIntroduceUserAndCorrectPassword(String user) {
        loginPage.correctLogin(user);
    }

    @When("^I introduce (.*) and incorrect (.*)$")
    public void iIntroduceUserAndIncorrectPassword(String user, String password) {
        loginPage.incorrectLogin(user, password);
    }

    @Then("I verify I not logged in")
    public void iVerifyINotLoggedIn() {
        Assertions.assertTrue(loginPage.verifyNotLoggedIn());
    }
}
