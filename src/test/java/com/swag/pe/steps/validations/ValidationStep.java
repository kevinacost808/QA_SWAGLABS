package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {
    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVisible(){
        return lbl_product.isVisible();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessage.isVisible();
    }

    @Step("Validar los productos listados en el carrito")
    public Boolean productsAreDisplayed(){
        for(WebElementFacade product:productList){
            if(product.isVisible()){
                return true;
            }
        }
        return false;
    }

    @Step("Validar que no haya ningun producto en el carrito")
    public Boolean shoppingIsEmpty(){
        for (WebElementFacade products:productList){
            if(!products.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    @Step("Validar visualizuación del mensaje de orden")
    public Boolean OrderIsVisible(){
        return lbl_order.isVisible();
    }
}
