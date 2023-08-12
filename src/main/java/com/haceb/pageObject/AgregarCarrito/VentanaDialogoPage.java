package com.haceb.pageObject.AgregarCarrito;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VentanaDialogoPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//div[starts-with(@class,'gigya-screen-dialog-close')]/a")
    public WebElementFacade btnCerrar;

    public WebElementFacade getBtnCerrar() {
        return btnCerrar;
    }

}
