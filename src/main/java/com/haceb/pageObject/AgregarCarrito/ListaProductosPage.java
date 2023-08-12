package com.haceb.pageObject.AgregarCarrito;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ListaProductosPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'shelve__item')]")
    public List<WebElementFacade> productos;

    public List<WebElementFacade> getProductos() {
        return productos;
    }

}
