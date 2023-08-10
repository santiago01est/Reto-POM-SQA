package com.haceb.steps.AgregarCarrito;

import com.haceb.pageObject.AgregarCarrito.ListaSubCategoriasPage;
import com.haceb.pageObject.AgregarCarrito.VentanaDialogoPage;
import com.haceb.utils.SeleccionAleatoria;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

public class ListaSubCategoriasSteps {
    @Page
    ListaSubCategoriasPage listaSubCategoriasPage;
    @Page
    VentanaDialogoPage ventanaDialogoPage;

    @Step("Seleccionar Aleatoriamente una subcategoria de la categoria eletrodomesticos cocina")
    public void seleccionaUnaSubcategoriaDeFormaAleatoria() {

        

        WebElement subCategoria = SeleccionAleatoria.seleccionarElementoAleatorio(
                listaSubCategoriasPage.getDriver(),
                listaSubCategoriasPage.getNombreSubCategoria()
        );
        

        subCategoria.click();
    }
}
