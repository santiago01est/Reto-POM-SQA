package com.haceb.pageObject.AgregarCarrito;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ListaSubCategoriasPage extends PageObject {
    // //li[contains(@class, 'has-children cocina-line')]
    // //li[@class='no-has-children'] //a[@class='nav__link']

    @FindBy(how = How.XPATH, using = "//li[contains(@class, 'has-children cocina-line')] //li[@class='no-has-children'] //a[@class='nav__link']")
    public List<WebElementFacade> nombreSubCWEF;

    public List<WebElementFacade> getNombreSubCWEF() {
        return nombreSubCWEF;
    }

}
