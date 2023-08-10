package com.haceb.steps.AgregarCarrito;

import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.haceb.pageObject.AgregarCarrito.BusquedaCategoriaPage;
import com.haceb.pageObject.AgregarCarrito.VentanaDialogoPage;
import com.haceb.utils.Espera;

public class BusquedaCategoriaSteps {
    @Page
    BusquedaCategoriaPage busquedaCategoriaPage;
    @Page
    VentanaDialogoPage ventanaDialogoPage;

    @Step("Abrir el navegador")
    public void abrirNavegador() {
        busquedaCategoriaPage.openUrl("https://www.haceb.com/");
    }

    @Step("Clic Categorias")
    public void clicSeleccionarCategoria() {

        // Metodo que espera 20 segundos hasta que aparece la ventana de dialogo para cerrarla
        Espera.esperaClicBoton(ventanaDialogoPage.getDriver(), ventanaDialogoPage.getBtnCerrar());
        //ventanaDialogoPage.getBtnCerrar().click();

        busquedaCategoriaPage.getDriver().findElement(busquedaCategoriaPage.getBtnCategorias()).click();

        WebElement elemento = busquedaCategoriaPage.getDriver().findElement(busquedaCategoriaPage.getNombreCategoria());

        Actions actions = new Actions(busquedaCategoriaPage.getDriver());
        actions.moveToElement(elemento).build().perform();

        
        // busquedaCategoriaPage.getNombreCategoria().click();

    }

}
