package com.haceb.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Espera {
    static public void esperaClicBoton(WebDriver driver, By elemento) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        driver.findElement(elemento).click();
        //WebElement elementoVisible = wait.until(ExpectedConditions.visibilityOf(elementoPadre));

    }
}
