package com.haceb.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;

public class SeleccionAleatoria {
    public static WebElement seleccionarElementoAleatorio(WebDriver driver, By elementoWeb) {
        List<WebElement> coleccion = driver.findElements(elementoWeb);
        Random random= new Random();
        int indexRandom= random.nextInt(coleccion.size());
        return coleccion.get(indexRandom);
    }

    public static WebElementFacade seleccionarElementoAleatorioWEF(List<WebElementFacade> coleccion) {
    
        Random random = new Random();
        int indexRandom = random.nextInt(coleccion.size());
        return coleccion.get(indexRandom);
    }

     
    
}
