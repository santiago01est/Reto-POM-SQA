package com.haceb.pageObject.AgregarCarrito;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidacionCarritoPage extends PageObject {

    @FindBy(how = How.ID, using = "product-name377")
    public WebElementFacade labelNombreProducto;

    public WebElementFacade getLabelNombreProducto() {
        return labelNombreProducto;
    }
    
}
