package com.haceb.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@RegistroExitoso",
        glue = "com/haceb/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerRegistro {
}
