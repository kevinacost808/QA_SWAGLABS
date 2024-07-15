package com.swag.pe.steps.products;

import com.swag.pe.pages.products.SelectProductPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SelectProductStep extends SelectProductPage {
    @Step("Agregar producto al carrito de compras")
    public void addProduct(int quantity){
        for (int i = 0; i < quantity; i++) {
            Actions actions = new Actions(getDriver());
            actions.click(products.get(i)).perform();
        }
    }

    @Step("Click en el icono del carrito de compras")
    public void clickShoppingCartIcon(){
        shoppingCartIcon.click();
    }

}
