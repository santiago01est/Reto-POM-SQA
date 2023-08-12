package com.haceb.steps.AgregarCarrito;

import com.haceb.pageObject.AgregarCarrito.ListaSubCategoriasPage;
import com.haceb.pageObject.AgregarCarrito.VentanaDialogoPage;
import com.haceb.utils.SeleccionAleatoria;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ListaSubCategoriasSteps {
    @Page
    ListaSubCategoriasPage listaSubCategoriasPage;
    @Page
    VentanaDialogoPage ventanaDialogoPage;

    @Step("Seleccionar Aleatoriamente una subcategoria de la categoria eletrodomesticos cocina")
    public void seleccionaUnaSubcategoriaDeFormaAleatoria() {

        WebElementFacade subCategoria = SeleccionAleatoria.seleccionarElementoAleatorioWEF(
                listaSubCategoriasPage.getNombreSubCWEF());
        subCategoria.click();
    }
}
