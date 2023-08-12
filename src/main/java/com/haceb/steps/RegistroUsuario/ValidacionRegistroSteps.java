package com.haceb.steps.RegistroUsuario;

import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import com.haceb.models.InformacionRegistro;
import com.haceb.pageObject.RegistroUsuario.ValidacionRegistroPage;
import com.haceb.utils.Espera;
import net.thucydides.core.annotations.Step;

public class ValidacionRegistroSteps {
    @Page
    ValidacionRegistroPage validacionRegistroPage;

    @Step("Validar nombre en perfil")
    public void validarRegistroPerfil() {
        
        Espera.esperaElementoVisible(validacionRegistroPage.getDriver(), validacionRegistroPage.getLabelNombre());
        Assert.assertTrue(
                validacionRegistroPage.getLabelNombre().isDisplayed());
        Assert.assertTrue(InformacionRegistro.data().get(0).get("nombre").contains(validacionRegistroPage.getLabelNombre().getText().toString()));
    }
}
