package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("I click on dropdown list of currencies and select Euro currency")
    public void iClickOnDropdownListOfCurrenciesAndSelectEuroCurrency() throws InterruptedException {
        Select select = new Select(homePage.currenciesList());
        select.selectByVisibleText("Euro");
        Thread.sleep(2000);
    }

    @Then("Euro Symbol is shown")
    public void euroSymbolIsShown() throws InterruptedException {
        for (int i = 0; i < homePage.assertion().size(); i++) {
            Assert.assertTrue(homePage.assertion().get(i).getText().contains("€"));
        }
    }
}
