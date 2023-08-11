package com.haceb.steps.RegistroUsuario;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

import com.haceb.pageObject.RegistroUsuario.VentanaRegistroBasico;
import com.haceb.utils.Espera;

import net.thucydides.core.annotations.Step;

public class VentanaRegistroBasicoSteps {

    @Page
    VentanaRegistroBasico ventanaRegistroBasico;

    @Step("Completar formulario de registro info basica")
    public void completarFormularioDeRegistroInfoBasica() {
        WebDriver driver = ventanaRegistroBasico.getDriver();
        // espera hasta que aparezca el boton ingresar a Haceb
        Espera.esperarIngresarTexto(driver, ventanaRegistroBasico.getTxtEmail(), "santiago01est@gmail.com");
        driver.findElement(ventanaRegistroBasico.getTxtNombre())
        .sendKeys("Sebastián");
        driver.findElement(ventanaRegistroBasico.getTxtApellido())
        .sendKeys("Garcia");

        
        driver.findElement(ventanaRegistroBasico.getTxContrasena())
        .sendKeys("ABc123456");
        Espera.esperarSegundos(driver);
        driver.findElement(ventanaRegistroBasico.getTxtConfirmarContrasena())
        .sendKeys("ABc123456");

        ventanaRegistroBasico.getTextTerminos().click();
        

    }
}
