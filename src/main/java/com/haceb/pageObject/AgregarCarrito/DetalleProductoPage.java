package com.haceb.pageObject.AgregarCarrito;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DetalleProductoPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'product__buy flex')]//a[starts-with(@class,'btn btn-default')]")
    public WebElementFacade btnAgregarCarrito;
    @FindBy(how = How.XPATH, using = "//h1[starts-with(@class, 'product__name visible-only-desktop')]")
    public WebElementFacade labelNombreProducto;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'cart-prod__total')]//a")
    public WebElementFacade btnCarrito;
    public WebElementFacade getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }
    public WebElementFacade getLabelNombreProducto() {
        return labelNombreProducto;
    }
    public WebElementFacade getBtnCarrito() {
        return btnCarrito;
    }
}
