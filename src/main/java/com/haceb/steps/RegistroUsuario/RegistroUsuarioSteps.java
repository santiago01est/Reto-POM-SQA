package com.haceb.steps.RegistroUsuario;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.haceb.pageObject.AgregarCarrito.VentanaDialogoPage;
import com.haceb.pageObject.RegistroUsuario.HomePage;
import com.haceb.utils.Espera;

import net.thucydides.core.annotations.Step;

public class RegistroUsuarioSteps {
    @Page
    HomePage homePage;
    @Page
    VentanaDialogoPage ventanaDialogoPage;

    @Step("Abrir el navegador")
    public void abrirNavegador() {
        homePage.openUrl("https://www.haceb.com/");
    }

    @Step("Hover perfil")
    public void clicPerfilRegistro() {

        
        // Metodo que espera 20 segundos hasta que aparece la ventana de dialogo para cerrarla
        Espera.esperaClicBoton(ventanaDialogoPage.getDriver(), ventanaDialogoPage.getBtnCerrar());

        //Hover perfil
        Actions actions = new Actions(homePage.getDriver());
        actions.moveToElement(homePage.btnPerfil).build().perform();

        //Espera para la opcion registrarse
        Espera.esperaClicBoton(homePage.getDriver(), homePage.getBtnRegistro());
    }

    @Step("Click ingresar al registro")
    public void clicIngresarHacebRegistro() {
        // espera hasta que aparezca el boton ingresar a Haceb
        Espera.esperaClicBoton(homePage.getDriver(), homePage.getBtnIngresarHaceb());
        switchToPage(homePage.getDriver().getWindowHandles().toArray()[1].toString());
    }

    private void switchToPage(String windowHandle) {
        homePage.getDriver().switchTo().window(windowHandle);
    }
}
