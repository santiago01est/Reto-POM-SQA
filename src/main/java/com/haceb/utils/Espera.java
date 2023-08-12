package com.haceb.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.WebElementFacade;

public class Espera {
    public static void esperaClicBoton(WebDriver driver, WebElementFacade elemento) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(elemento));
        elemento.click();

    }

    public static void esperaElementoVisible(WebDriver driver, WebElementFacade elemento) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(elemento));

    }

    public static void esperarIngresarTexto(WebDriver driver, WebElementFacade elemento, String texto) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(elemento));

        elemento.sendKeys(texto);

        // WebElement elementoVisible =
        // wait.until(ExpectedConditions.visibilityOf(elementoPadre));

    }

    

    public static void esperarSegundos(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("x")));
    }

    public static void esperaCheckBox(WebDriver driver, By elemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(elemento)).click();
    }

}
