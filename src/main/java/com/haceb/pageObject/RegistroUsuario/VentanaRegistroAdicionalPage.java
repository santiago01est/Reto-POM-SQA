package com.haceb.pageObject.RegistroUsuario;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VentanaRegistroAdicionalPage extends PageObject {
    
    // //*[@id="gigya-textbox-153635908553265760"]
    // //*[@id="gigya-dropdown-153944062160082270"]//option

    @FindBy(how = How.XPATH, using = "//form[@id='gigya-profile-form']//input[@id='gigya-textbox-153635908553265760']")
    public WebElementFacade txtCedula;

    @FindBy(how = How.XPATH , using = "//select[@id='gigya-dropdown-153944062160082270']")
    public WebElementFacade combboxGenero;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-dropdown-153944062160082270']//option")
    public List<WebElementFacade> opcionesCombboxGenero;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-textbox-29430652596742216']")
    public WebElementFacade calendarioFecha;

    @FindBy(how = How.XPATH, using = "//input[contains(@value,'Enviar')]")
    public WebElementFacade btnEnviar;

    public WebElementFacade getTxtCedula() {
        return txtCedula;
    }

    public WebElementFacade getCombboxGenero() {
        return combboxGenero;
    }

    public List<WebElementFacade> getOpcionesCombboxGenero() {
        return opcionesCombboxGenero;
    }

    public WebElementFacade getCalendarioFecha() {
        return calendarioFecha;
    }

    public WebElementFacade getBtnEnviar() {
        return btnEnviar;
    }
}
