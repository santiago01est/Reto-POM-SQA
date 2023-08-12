package com.haceb.steps.RegistroUsuario;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import com.haceb.models.InformacionRegistro;
import com.haceb.pageObject.RegistroUsuario.VentanaRegistroBasico;
import com.haceb.utils.CapturarInformacion;
import com.haceb.utils.Espera;
import com.haceb.utils.js.MetodosJS;

import net.thucydides.core.annotations.Step;

public class VentanaRegistroBasicoSteps {

    @Page
    VentanaRegistroBasico ventanaRegistroBasico;

    @Step("Completar formulario de registro info basica")
    public void completarFormularioDeRegistroInfoBasica() {
        WebDriver driver = ventanaRegistroBasico.getDriver();
        // espera hasta que aparezca el boton ingresar a Haceb
        Espera.esperarIngresarTexto(driver, ventanaRegistroBasico.getTxtEmail(), InformacionRegistro.data().get(0).get("correo"));
        ventanaRegistroBasico.getTxtNombre().sendKeys(InformacionRegistro.data().get(0).get("nombre"));
        //Guardar nombre
        //CapturarInformacion.guardarNombre("Santiago");
        ventanaRegistroBasico.getTxtApellido().sendKeys(InformacionRegistro.data().get(0).get("apelido"));
        
        ventanaRegistroBasico.getTxContrasena().sendKeys(InformacionRegistro.data().get(0).get("pass"));
        Espera.esperarSegundos(driver);
        ventanaRegistroBasico.getTxtConfirmarContrasena().sendKeys(InformacionRegistro.data().get(0).get("pass"));

        Espera.esperarSegundos(driver);
        //CheckBox
        MetodosJS.clickJS(driver, ventanaRegistroBasico.getBtnTerminos());
        //RadioButton
        MetodosJS.clickJS(driver, ventanaRegistroBasico.getBtnAutorizar());
        //Boton registrar
        Espera.esperaClicBoton(driver, ventanaRegistroBasico.getBtnRegistrar());

    }
}
