package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {
    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txtUsername.sendKeys(username);
    }

    @Step("Ingresar contrasena")
    public void typePassword(String password){
        txtPassword.sendKeys(password);
    }

    @Step("Click en el boton login")
    public void clickLogin(){
        btn_login.click();
    }
}
