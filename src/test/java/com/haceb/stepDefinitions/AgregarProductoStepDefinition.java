package com.haceb.stepDefinitions;



import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class AgregarProductoStepDefinition {

    

    @Dado("que el usuario abre la pagina del haceb")
    public void queElUsuarioAbreLaPaginaDelHaceb() {
        //busquedaCategoriaSteps.abrirNavegador();
    }

    @Cuando("el usuario selecciona una categoria")
    public void elUsuarioSeleccionaUnaCategoria() {
        //busquedaCategoriaSteps.clicSeleccionarCategoria();
    }

    @Cuando("selecciona una subcategoria de forma aleatoria")
    public void seleccionaUnaSubcategoriaDeFormaAleatoria() {
        //listaSubCategoriasSteps.seleccionaUnaSubcategoriaDeFormaAleatoria();
    }

    @Cuando("da click a un producto de forma aleatoria")
    public void daClickAUnProductoDeFormaAleatoria() {
        //listaProductoSteps.seleccionarProductoAleatorio();
    }

    @Cuando("agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {
        //detalleProductoSteps.clicAgregarProducto();
    }

    @Cuando("agrega el producto")
    public void agregaElProducto() {
    }

    @Entonces("el usuario podrá ver el nombre producto en el carrito.")
    public void elUsuarioPodráVerElNombreProductoEnElCarrito() {

    }
}
