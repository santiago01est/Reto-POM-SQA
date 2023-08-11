package com.haceb.pageObject.RegistroUsuario;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
    @FindBy(xpath = "//div[contains(@class, 'link-account-user')]")
    public WebElementFacade btnPerfil;
    @FindBy(xpath = "//a[contains(@class, 'cdc-register')]")
    public WebElementFacade btnRegistro;
    @FindBy(id = "vtexIdUI-custom-oauth")
    public WebElementFacade btnIngresarHaceb;


    public WebElementFacade getBtnPerfil() {
        return btnPerfil;
    }

    public WebElementFacade getBtnRegistro() {
        return btnRegistro;
    }
    public WebElementFacade getBtnIngresarHaceb() {
        return btnIngresarHaceb;
    }
}
