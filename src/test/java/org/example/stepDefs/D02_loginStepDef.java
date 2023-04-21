package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();

    @Given("I go to login page")
    public void iGoToLoginPage() {
        login.loginPage().click();
    }

    @When("I login with valid email and password")
    public void iLoginWithValidEmailAndPassword() {
        login.loginPageEmail().sendKeys("Peter10@test.com");
        login.loginPagePassword().sendKeys("peter@123456789");
    }


    @And("I press on login button")
    public void iPressOnLoginButton() {
        login.loginPageButton().click();
    }

    @Then("I login to the system successfully")
    public void iLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String actualUrl = login.url();
        String expectedUrl = "https://demo.nopcommerce.com/";
        soft.assertEquals(actualUrl, expectedUrl);
        soft.assertTrue(login.loginSuccessfully().isDisplayed());
        soft.assertAll();
    }

    @When("I login with invalid email and password")
    public void iLoginWithInvalidEmailAndPassword() {
        login.loginPageEmail().sendKeys("peter000@test.com");
        login.loginPagePassword().sendKeys("peter01230123");
    }

    @Then("I could not login to the system")
    public void iCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.errorMessage().getText().contains("Login was unsuccessful"));
        String actualColor = login.errorMessage().getCssValue("color");
        String colorHex = Color.fromString(actualColor).asHex();
        String expectedColor = "#e4434b";
        soft.assertEquals(expectedColor, colorHex);
        soft.assertAll();
    }
}
