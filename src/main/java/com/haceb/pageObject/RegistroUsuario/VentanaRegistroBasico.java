package com.haceb.pageObject.RegistroUsuario;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class VentanaRegistroBasico extends PageObject{

    private By txtEmail = By.xpath("//input[contains(@placeholder, 'Correo electrónico *')]");
    private By txtNombre = By.xpath("//input[contains(@placeholder, 'Nombre *')]");
    private By txtApellido = By.xpath("//input[contains(@placeholder, 'Apellido *')]");
    private By txtContrasena = By.xpath("//input[contains(@placeholder, 'Contraseña *')]");
    private By txtConfirmarContrasena = By.xpath("//input[contains(@placeholder, 'Confirma la contraseña *')]");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxContrasena() {
        return txtContrasena;
    }

    public By getTxtConfirmarContrasena() {
        return txtConfirmarContrasena;
    }
    
}
