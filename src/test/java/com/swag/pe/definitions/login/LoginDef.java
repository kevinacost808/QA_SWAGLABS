package com.swag.pe.definitions.login;

import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.validations.ValidationStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    ValidationStep validationStep;

    @Steps(shared = true)
    LoginStep loginStep;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("ingresa credenciales validas")
    public void userLoginWithValidCredentials(){
        loginStep.typeUsername("standard_user");
        loginStep.typePassword("secret_sauce");
        loginStep.clickLogin();
    }

    @Then("la aplicacion deberia mostrar el modulo principal de productos")
    public void systemShowProductsModule(){
        Assert.assertTrue(validationStep.titleIsVisible());
    }

    @When("ingresa credenciales invalidas")
    public void userLoginWithInvalidCredentials(){
        loginStep.typeUsername("sad");
        loginStep.typePassword("123");
        loginStep.clickLogin();
    }

    @Then("la aplicacion deberia mostrar mensaje de error")
    public void showErrormessage(){
        Assert.assertTrue(validationStep.errorMessageIsDisplayed());
    }

}
