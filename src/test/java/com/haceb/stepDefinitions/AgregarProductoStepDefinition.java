package com.haceb.stepDefinitions;

import com.haceb.steps.AgregarCarrito.BusquedaCategoriaSteps;
import com.haceb.steps.AgregarCarrito.DetalleProductoSteps;
import com.haceb.steps.AgregarCarrito.ListaProductoSteps;
import com.haceb.steps.AgregarCarrito.ListaSubCategoriasSteps;
import com.haceb.steps.AgregarCarrito.ValidacionCarritoStep;

import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class AgregarProductoStepDefinition {

    @Steps
    BusquedaCategoriaSteps busquedaCategoriaSteps;
    @Steps
    ListaSubCategoriasSteps listaSubCategoriasSteps;
    @Steps
    ListaProductoSteps listaProductoSteps;
    @Steps
    DetalleProductoSteps detalleProductoSteps;
    @Steps
    ValidacionCarritoStep validacionCarritoPageSteps;

    @Dado("que el usuario abre la pagina del haceb")
    public void queElUsuarioAbreLaPaginaDelHaceb() {
        busquedaCategoriaSteps.abrirNavegador();
    }

    @Cuando("el usuario selecciona una categoria")
    public void elUsuarioSeleccionaUnaCategoria() {
        busquedaCategoriaSteps.clicSeleccionarCategoria();
    }

    @Cuando("selecciona una subcategoria de forma aleatoria")
    public void seleccionaUnaSubcategoriaDeFormaAleatoria() {
        listaSubCategoriasSteps.seleccionaUnaSubcategoriaDeFormaAleatoria();
    }

    @Cuando("da click a un producto de forma aleatoria")
    public void daClickAUnProductoDeFormaAleatoria() {
        listaProductoSteps.seleccionarProductoAleatorio();
    }

    @Cuando("agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {
        detalleProductoSteps.clicAgregarProducto();
    }

    @Cuando("va al carrito")
    public void agregaElProducto() {
        detalleProductoSteps.clicCarrito();
    }

    @Entonces("el usuario podrá ver el nombre producto en el carrito.")
    public void elUsuarioPodráVerElNombreProductoEnElCarrito() {
        validacionCarritoPageSteps.validarNombreCarrito();
    }
}
