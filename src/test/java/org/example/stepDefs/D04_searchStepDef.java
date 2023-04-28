package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();

    @When("I go to the homepage and click on search bar and enter product name in the search par as{string}")
    public void iGoToTheHomepageAndClickOnSearchBarAndEnterProductNameInTheSearchParAs(String arg0) {
        search.searchPar().sendKeys(arg0);
        search.searchButton().click();
    }

    @Then("go from the homepage to the product page")
    public void goFromTheHomepageToTheProductPage() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();
    }

    @And("search contains{string}")
    public void searchContains(String arg0) {
        for (int i = 0; i < search.containsAssertion().size(); i++) {
            Assert.assertTrue(search.containsAssertion().get(i).getText().contains(arg0));
        }
    }

    @When("I get to the homepage, I use the search bar and type {string} as the search parameter")
    public void iGetToTheHomepageIUseTheSearchBarAndTypeAsTheSearchParameter(String arg0) throws InterruptedException {
        search.searchPar().sendKeys(arg0);
    }

    @Then("The product page has the sku")
    public void theProductPageHasTheSku() throws InterruptedException {
        search.clickOnProduct().get(0).click();
        Thread.sleep(2000);
    }

    @And("search contains sku {string}")
    public void searchContainsSku(String arg0) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(search.sku().getText().contains(arg0),"Error message does not contain expected text.");
    }
}

