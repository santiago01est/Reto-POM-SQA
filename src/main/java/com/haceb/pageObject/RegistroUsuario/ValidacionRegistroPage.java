package com.haceb.pageObject.RegistroUsuario;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidacionRegistroPage extends PageObject {

    
    @FindBy(how = How.XPATH, using = "//*[@id='gigya-textbox-firstName']")
    public WebElementFacade labelNombre;

    public WebElementFacade getLabelNombre() {
        return labelNombre;
    }
    
}
