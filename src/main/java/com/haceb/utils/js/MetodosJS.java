package com.haceb.utils.js;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.WebElementFacade;

public class MetodosJS {
    
    //Metodo para dar clic mediante JS 
    public static void clickJS(WebDriver driver, WebElementFacade elemento) {
        JavascriptExecutor executor= (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elemento);
    }

    
}
