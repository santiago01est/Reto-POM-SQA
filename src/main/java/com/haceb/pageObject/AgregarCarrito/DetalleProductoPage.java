package com.haceb.pageObject.AgregarCarrito;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class DetalleProductoPage extends PageObject{
    
    private By btnAgregarCarrito= By.xpath("//div[contains(@class, 'product__buy flex')]//a[starts-with(@class,'btn btn-default')]");

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }
}
