package com.haceb.stepDefinitions;

import com.haceb.steps.RegistroUsuario.RegistroUsuarioSteps;
import com.haceb.steps.RegistroUsuario.VentanaRegistroBasicoSteps;

import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistroUsuarioStepDefinition {

    @Steps
    RegistroUsuarioSteps registroUsuarioSteps;
    @Steps
    VentanaRegistroBasicoSteps ventanaRegistroBasicoSteps;

    @Dado("que el usuario abre la pagina de haceb")
    public void queElUsuarioAbreLaPaginaDeHaceb() {
        registroUsuarioSteps.abrirNavegador();
    }

    @Cuando("se posiciona en perfil y da click en registrarse")
    public void sePosicionaEnPerfilYDaClickEnRegistrarse() {
        registroUsuarioSteps.clicPerfilRegistro();
    }

    @Cuando("da click en ingresar a haceb")
    public void daClickEnIngresarAHaceb() {
        registroUsuarioSteps.clicIngresarHacebRegistro();
    }

    @Cuando("completa el formulario de registro datos basicos")
    public void completaElFormularioDeRegistroDatosBasicos() {
        ventanaRegistroBasicoSteps.completarFormularioDeRegistroInfoBasica();
    }

    @Cuando("da click en registrarme")
    public void daClickEnRegistrarme() {

    }

    @Cuando("completa el formulario datos adicionales")
    public void completaElFormularioDatosAdicionales() {

    }

    @Cuando("da click en completar registro")
    public void daClickEnCompletarRegistro() {

    }

    @Entonces("el usuario podrá ver un mensaje de bienvenida.")
    public void elUsuarioPodráVerUnMensajeDeBienvenida() {

    }
}
