package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    public WebElement registerlink() {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement genderType() {

        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName() {
        return Hooks.driver.findElement(By.xpath("//input[@id='FirstName']"));
    }

    public WebElement lastName() {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement staticDayList() {
        WebElement list = Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
        return list;
    }

    public WebElement staticMonthList() {
        WebElement list = Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
        return list;
    }

    public WebElement staticYearList() {
        WebElement list = Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        return list;
    }

    public WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerButton() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement successMessage() {
        return Hooks.driver.findElement(By.className("result"));
    }

}
