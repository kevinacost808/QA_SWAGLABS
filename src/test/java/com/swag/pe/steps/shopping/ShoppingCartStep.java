package com.swag.pe.steps.shopping;

import com.swag.pe.pages.shopping.ShoppingCartPage;
import net.thucydides.core.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {
    @Step("Click en el boton checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    @Step("Input your firstname")
    public void typeFirstName(String firstname){
        txt_firstname.sendKeys(firstname);
    }

    @Step("Input your lastname")
    public void typeLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Input your post code")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }

    @Step("Click en el boton continue")
    public void clickContinueButton(){
        continueButton.click();
    }

    @Step("Click en el boton finish")
    public void clickFinishButton(){
        finishButton.click();
    }

}
