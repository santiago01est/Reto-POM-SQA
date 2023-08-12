package com.haceb.pageObject.RegistroUsuario;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VentanaRegistroBasico extends PageObject {

    @FindBy(how = How.ID, using = "gigya-loginID-51216659851706440")
    public WebElementFacade txtEmail;

    @FindBy(how = How.ID, using = "gigya-textbox-72173553995486780")
    public WebElementFacade txtNombre;

    @FindBy(how = How.ID, using = "gigya-textbox-146410824335495100")
    public WebElementFacade txtApellido;

    @FindBy(how = How.ID, using = "gigya-password-54061940132406190")
    public WebElementFacade txtContrasena;

    @FindBy(how = How.ID, using = "gigya-password-142670944012194750")
    public WebElementFacade txtConfirmarContrasena;

    @FindBy(how = How.XPATH, using = "//label[@for='gigya-checkbox-70031539084410860']//span[@class='gigya-label-text gigya-checkbox-text']")
    public WebElementFacade btnTerminos;

    @FindBy(how = How.XPATH, using = "//label[@for='gigya-multiChoice-0-98366419479004930']")
    public WebElementFacade btnAutorizar;

    @FindBy(how = How.XPATH, using = "//input[@value='REGISTRARME']")
    public WebElementFacade btnRegistrar;



    public WebElementFacade getTxtEmail() {
        return txtEmail;
    }

    public WebElementFacade getTxtNombre() {
        return txtNombre;
    }

    public WebElementFacade getTxtApellido() {
        return txtApellido;
    }

    public WebElementFacade getTxContrasena() {
        return txtContrasena;
    }

    public WebElementFacade getTxtConfirmarContrasena() {
        return txtConfirmarContrasena;
    }

    public WebElementFacade getBtnTerminos() {
        return btnTerminos;
    }

    public WebElementFacade getBtnAutorizar() {
        return btnAutorizar;
    }

    public WebElementFacade getBtnRegistrar() {
        return btnRegistrar;
    }



}
