package com.haceb.pageObject.RegistroUsuario;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {
    private By btnPerfil= By.xpath("//div[contains(@class, 'link-account-user')]");
    private By btnRegistro = By.xpath("//a[contains(@class, 'cdc-register')]");
    private By btnIngresarHaceb= By.id("vtexIdUI-custom-oauth");

    public By getBtnPerfil() {
        return btnPerfil;
    }

    public By getBtnRegistro() {
        return btnRegistro;
    }
    public By getBtnIngresarHaceb() {
        return btnIngresarHaceb;
    }
}
