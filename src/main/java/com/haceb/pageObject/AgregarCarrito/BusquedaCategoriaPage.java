package com.haceb.pageObject.AgregarCarrito;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BusquedaCategoriaPage extends PageObject {

    @FindBy(how = How.ID, using = "btnDropMenu")
    public WebElementFacade btnCategorias;

    @FindBy(how = How.XPATH, using = "//li[starts-with(@class,'has-children cocina-line')]")
    public WebElementFacade nombreCategoria;

    public WebElementFacade getBtnCategorias() {
        return btnCategorias;
    }

    public WebElementFacade getNombreCategoria() {
        return nombreCategoria;
    }

}
