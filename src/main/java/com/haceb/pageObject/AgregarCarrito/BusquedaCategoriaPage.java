package com.haceb.pageObject.AgregarCarrito;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BusquedaCategoriaPage extends PageObject{
    
    //private By btnCategorias= By.id("btnDropMenu");
    @FindBy(id = "btnDropMenu")
    public WebElementFacade btnCategorias;
    
    //private By nombreCategoria= By.xpath("//li[starts-with(@class,'has-children cocina-line')]");
    @FindBy(xpath = "//li[starts-with(@class,'has-children cocina-line')]")
    public WebElementFacade nombreCategoria;
    public WebElementFacade getBtnCategorias() {
        return btnCategorias;
    }

    public WebElementFacade getNombreCategoria() {
        return nombreCategoria;
    }

   

}
