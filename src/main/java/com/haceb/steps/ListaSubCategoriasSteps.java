package com.haceb.steps;

import com.haceb.pageObject.ListaSubCategoriasPage;
import com.haceb.pageObject.VentanaDialogoPage;
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
