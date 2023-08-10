package com.haceb.pageObject.AgregarCarrito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class VentanaDialogoPage extends PageObject{
    // //div[starts-with(@class,'gigya-screen-dialog-close')]/a
    private By btnCerrar= By.xpath("//div[starts-with(@class,'gigya-screen-dialog-close')]/a");

    public By getBtnCerrar() {
        return btnCerrar;
    }
}
