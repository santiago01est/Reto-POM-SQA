package com.haceb.steps.AgregarCarrito;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.haceb.pageObject.AgregarCarrito.ListaProductosPage;
import com.haceb.utils.SeleccionAleatoria;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ListaProductoSteps {
    @Page
    ListaProductosPage listaProductosPage;

    @Step("Seleccionar Aleatoriamente un producto")
    public void seleccionarProductoAleatorio() {
        WebElementFacade producto = SeleccionAleatoria
                .seleccionarElementoAleatorioWEF(listaProductosPage.getProductos());
        Actions actions = new Actions(listaProductosPage.getDriver());
        actions.moveToElement(producto);
        actions.perform();
        producto.click();
    }
}
