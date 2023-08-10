package com.haceb.pageObject.AgregarCarrito;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class ListaSubCategoriasPage extends PageObject{
    // //li[contains(@class, 'has-children cocina-line')] //li[@class='no-has-children'] //a[@class='nav__link']

    private By nombreSubCategoria= By.xpath("//li[contains(@class, 'has-children cocina-line')] //li[@class='no-has-children'] //a[@class='nav__link']");
    
    public By getNombreSubCategoria() {
        return nombreSubCategoria;
    }

   
}
