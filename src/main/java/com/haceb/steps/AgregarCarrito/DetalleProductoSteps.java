package com.haceb.steps.AgregarCarrito;

import org.fluentlenium.core.annotation.Page;

import com.haceb.pageObject.AgregarCarrito.DetalleProductoPage;
import com.haceb.utils.CapturarInformacion;
import com.haceb.utils.Espera;

import net.thucydides.core.annotations.Step;

public class DetalleProductoSteps {

    @Page
    DetalleProductoPage detalleProductoPage;

    @Step("Clic agregar producto")
    public void clicAgregarProducto() {
        Espera.esperaElementoVisible(detalleProductoPage.getDriver(), detalleProductoPage.getLabelNombreProducto());
        CapturarInformacion.guardarNombre(detalleProductoPage.getLabelNombreProducto().getText());
        detalleProductoPage.getBtnAgregarCarrito().click();

    }

    @Step("Clic ver carrito")
    public void clicCarrito() {
        Espera.esperaClicBoton(detalleProductoPage.getDriver(), detalleProductoPage.getBtnCarrito());
    }
}
