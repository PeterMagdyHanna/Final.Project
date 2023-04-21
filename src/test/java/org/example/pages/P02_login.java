package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginPage() {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement loginPageEmail() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement loginPagePassword() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginPageButton() {
        return Hooks.driver.findElement(By.className("login-button"));
    }

    public String url() {
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement loginSuccessfully() {
        return Hooks.driver.findElement(By.className("ico-account"));
    }

    public WebElement errorMessage() {
        return Hooks.driver.findElement(By.className("message-error"));
    }

}
