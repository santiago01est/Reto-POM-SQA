package com.haceb.steps.RegistroUsuario;

import org.fluentlenium.core.annotation.Page;
import com.haceb.models.InformacionRegistro;
import com.haceb.pageObject.RegistroUsuario.VentanaRegistroAdicionalPage;
import com.haceb.utils.Espera;
import com.haceb.utils.SeleccionAleatoria;
import com.haceb.utils.js.MetodosJS;

import net.thucydides.core.annotations.Step;

public class VentanaRegistroAdicionalSteps {

    @Page
    VentanaRegistroAdicionalPage ventanaRegistroAdicionalPage;

    @Step("Completar formulario de registro info adicional")
    public void completarFormularioDeRegistroInfoAdicional() {
        // Cedula
        Espera.esperarIngresarTexto(ventanaRegistroAdicionalPage.getDriver(),
                ventanaRegistroAdicionalPage.getTxtCedula(), InformacionRegistro.data().get(0).get("cedula"));

        Espera.esperarSegundos(ventanaRegistroAdicionalPage.getDriver());
        // Genero
        MetodosJS.clickJS(ventanaRegistroAdicionalPage.getDriver(),
                ventanaRegistroAdicionalPage.getCombboxGenero());
        // esperar
        Espera.esperarSegundos(ventanaRegistroAdicionalPage.getDriver());
        // Opciones combo
        SeleccionAleatoria.seleccionarElementoAleatorioWEF(ventanaRegistroAdicionalPage.getOpcionesCombboxGenero())
                .click();

        ventanaRegistroAdicionalPage.getCalendarioFecha().doubleClick();
        // ventanaRegistroAdicionalPage.getCalendarioFecha().clear();

        // fecha
        ventanaRegistroAdicionalPage.getCalendarioFecha().sendKeys(InformacionRegistro.data().get(0).get("dia"));
        ventanaRegistroAdicionalPage.getCalendarioFecha().sendKeys(InformacionRegistro.data().get(0).get("mes"));
        ventanaRegistroAdicionalPage.getCalendarioFecha().sendKeys(InformacionRegistro.data().get(0).get("año"));

    }

    @Step("clic en registrarse")
    public void clicRegistrarUsuario() {
        Espera.esperaClicBoton(ventanaRegistroAdicionalPage.getDriver(), ventanaRegistroAdicionalPage.getBtnEnviar());
        Espera.esperarSegundos(ventanaRegistroAdicionalPage.getDriver());

        // Volver a la ventana principal
        switchToPage(ventanaRegistroAdicionalPage.getDriver().getWindowHandles().toArray()[0].toString());

    }

    private void switchToPage(String windowHandle) {
        ventanaRegistroAdicionalPage.getDriver().switchTo().window(windowHandle);
    }
}
