package com.haceb.pageObject.RegistroUsuario;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VentanaRegistroBasico extends PageObject{

    private By txtEmail = By.xpath("//input[contains(@placeholder, 'Correo electrónico *')]");
    private By txtNombre = By.xpath("//input[contains(@placeholder, 'Nombre *')]");
    private By txtApellido = By.xpath("//input[contains(@placeholder, 'Apellido *')]");
    private By txtContrasena = By.xpath("//input[contains(@placeholder, 'Contraseña *')]");
    private By txtConfirmarContrasena = By.xpath("//input[contains(@placeholder, 'Confirma la contraseña *')]");
    //private By checkTerminos= By.xpath("//input[contains(@id,'gigya-checkbox-70031539084410860')]");     
    //private By rdBtnAutorizacion= By.xpath("//label[contains(@label, 'gigya-multiChoice-0-98366419479004930')]");
    @FindBy(xpath = "//label[@for='gigya-checkbox-70031539084410860']")
    public WebElementFacade txtTerminos;
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

    

    public WebElementFacade getTextTerminos() {
        return txtTerminos;
    }
    
}
