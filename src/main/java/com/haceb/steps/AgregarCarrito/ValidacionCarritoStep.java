package com.haceb.steps.AgregarCarrito;

import org.fluentlenium.core.annotation.Page;

import com.haceb.models.InformacionRegistro;
import com.haceb.pageObject.AgregarCarrito.ValidacionCarritoPage;
import com.haceb.utils.Espera;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ValidacionCarritoStep {
    @Page
    ValidacionCarritoPage validacionCarritoPage;
    
    @Step("validar nombre del producto en carrito")
    public void validarNombreCarrito() {
        Espera.esperaElementoVisible(validacionCarritoPage.getDriver(), validacionCarritoPage.getLabelNombreProducto());
        Assert.assertTrue(InformacionRegistro.data().get(0).get("validacion").contains(validacionCarritoPage.getLabelNombreProducto().getText().toString()));
    }
}
