package com.haceb.stepDefinitions;

import com.haceb.steps.RegistroUsuario.RegistroUsuarioSteps;
import com.haceb.steps.RegistroUsuario.ValidacionRegistroSteps;
import com.haceb.steps.RegistroUsuario.VentanaRegistroAdicionalSteps;
import com.haceb.steps.RegistroUsuario.VentanaRegistroBasicoSteps;

import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistroUsuarioStepDefinition {

    @Steps
    RegistroUsuarioSteps registroUsuarioSteps;
    @Steps
    VentanaRegistroBasicoSteps ventanaRegistroBasicoSteps;
    @Steps
    VentanaRegistroAdicionalSteps ventanaRegistroAdicionalSteps;
    @Steps
    ValidacionRegistroSteps validacionRegistroSteps;

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

    @Cuando("completa el formulario de registro datos basicos y se registra")
    public void completaElFormularioDeRegistroDatosBasicosYSeRegistra() {
        ventanaRegistroBasicoSteps.completarFormularioDeRegistroInfoBasica();
    }


    @Cuando("completa el formulario datos adicionales")
    public void completaElFormularioDatosAdicionales() {
        ventanaRegistroAdicionalSteps.completarFormularioDeRegistroInfoAdicional();
    }

    @Cuando("da click en completar registro")
    public void daClickEnCompletarRegistro() {
        ventanaRegistroAdicionalSteps.clicRegistrarUsuario();
    }

    @Entonces("el usuario podrá ver un mensaje de bienvenida.")
    public void elUsuarioPodráVerUnMensajeDeBienvenida() {
        validacionRegistroSteps.validarRegistroPerfil();
    }
}
