package com.swag.pe.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
    @FindBy(id = "user-name")
    protected WebElementFacade txtUsername;

    @FindBy(id = "password")
    protected WebElementFacade txtPassword;

    @FindBy(id = "login-button")
    protected WebElementFacade btn_login;
}
