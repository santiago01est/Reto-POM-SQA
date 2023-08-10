package com.haceb.steps.RegistroUsuario;

import org.fluentlenium.core.annotation.Page;
import com.haceb.pageObject.RegistroUsuario.VentanaRegistroBasico;
import com.haceb.utils.Espera;

import net.thucydides.core.annotations.Step;

public class VentanaRegistroBasicoSteps {

    @Page
    VentanaRegistroBasico ventanaRegistroBasico;

    @Step("Completar formulario de registro info basica")
    public void completarFormularioDeRegistroInfoBasica() {
        // espera hasta que aparezca el boton ingresar a Haceb
        Espera.esperarIngresarTexto(ventanaRegistroBasico.getDriver(), ventanaRegistroBasico.getTxtEmail(), "santiago01est@gmail.com");
        ventanaRegistroBasico.getDriver().findElement(ventanaRegistroBasico.getTxtNombre())
        .sendKeys("Sebastián");
        ventanaRegistroBasico.getDriver().findElement(ventanaRegistroBasico.getTxtApellido())
        .sendKeys("Garcia");

        
        ventanaRegistroBasico.getDriver().findElement(ventanaRegistroBasico.getTxContrasena())
        .sendKeys("ABc123456");
        Espera.esperarSegundos(ventanaRegistroBasico.getDriver());
        ventanaRegistroBasico.getDriver().findElement(ventanaRegistroBasico.getTxtConfirmarContrasena())
        .sendKeys("ABc123456");
    }
}
