package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();

    @Given("I go to register page")
    public void goToRegister() {
        register.registerlink().click();
    }

    @And("I select gender type")
    public void iSelectGenderType() {
        register.genderType().click();
    }

    @And("I enter first name")
    public void iEnterFirstName() {
        register.firstName().sendKeys("Peter");
    }

    @And("I enter last name")
    public void iEnterLastName() {
        register.lastName().sendKeys("Magdy");
    }

    @And("I enter date of birth")
    public void iEnterDateOfBirth() {
        Select daylist = new Select(register.staticDayList());
        daylist.selectByValue("11");
        register.staticDayList().click();
        Select monthlist = new Select(register.staticMonthList());
        monthlist.selectByValue("9");
        Select yearlist = new Select(register.staticYearList());
        yearlist.selectByValue("1995");
    }

    @And("I enter email")
    public void iEnterEmail() {
        register.email().sendKeys("Peter10@test.com");
    }

    @And("I fills Password fields")
    public void iFillsPasswordFields() {
        register.password().sendKeys("peter@123456789");
        register.confirmPassword().sendKeys("peter@123456789");
    }

    @When("I click on register button")
    public void iClickOnRegisterButton() {
        register.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.successMessage().getText().contains("Your registration completed"));
        String actualColor = register.successMessage().getCssValue("color");
        String expectedColor = "rgba(76, 177, 124, 1)";
        soft.assertEquals(expectedColor, actualColor);
        soft.assertAll();
    }
}
