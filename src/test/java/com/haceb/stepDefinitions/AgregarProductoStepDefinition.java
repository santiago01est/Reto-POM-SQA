package com.haceb.stepDefinitions;

import com.haceb.steps.BusquedaCategoriaSteps;
import com.haceb.steps.ListaSubCategoriasSteps;

import io.cucumber.java.es.*;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AgregarProductoStepDefinition {

    @Steps
    BusquedaCategoriaSteps busquedaCategoriaSteps;
    @Steps
    ListaSubCategoriasSteps listaSubCategoriasSteps;

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
    }

    @Cuando("agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {
    }

    @Cuando("agrega el producto")
    public void agregaElProducto() {
    }

    @Entonces("el usuario podrá ver el nombre producto en el carrito.")
    public void elUsuarioPodráVerElNombreProductoEnElCarrito() {

    }
}
