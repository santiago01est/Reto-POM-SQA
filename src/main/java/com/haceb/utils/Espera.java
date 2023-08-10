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

    static public void esperarIngresarTexto(WebDriver driver, By elemento, String texto) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

        driver.findElement(elemento)
                .sendKeys(texto);
        
        //WebElement elementoVisible = wait.until(ExpectedConditions.visibilityOf(elementoPadre));

    }

    static public void esperarSegundos(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("x")));
    }

}
