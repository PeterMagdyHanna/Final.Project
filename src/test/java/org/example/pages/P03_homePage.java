package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement currenciesList() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> assertion() {
        return Hooks.driver.findElements(By.className("actual-price"));
    }

    public WebElement searchPar() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton() {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }

    public List<WebElement> containsAssertion() {
        return Hooks.driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/Li"));
    }

    public List<WebElement> clickOnProduct() {
        return Hooks.driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"]"));
    }
    public WebElement sku (){
        return Hooks.driver.findElement(By.className("sku"));
    }

}
