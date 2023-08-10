package com.haceb.pageObject.AgregarCarrito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class BusquedaCategoriaPage extends PageObject{
    
    private By btnCategorias= By.id("btnDropMenu");
    // //a[contains(@title,'Electrodomésticos de cocina')]
    // //li[starts-with(@class,'has-children cocina-line')]
    private By nombreCategoria= By.xpath("//li[starts-with(@class,'has-children cocina-line')]");
    
    public By getBtnCategorias() {
        return btnCategorias;
    }

    public By getNombreCategoria() {
        return nombreCategoria;
    }

}
