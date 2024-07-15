package com.swag.pe.definitions.shopping;

import com.swag.pe.steps.products.SelectProductStep;
import com.swag.pe.steps.shopping.ShoppingCartStep;
import com.swag.pe.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {
    @Steps(shared = true)
    SelectProductStep selectProductStep;

    @Steps(shared = true)
    ValidationStep validationStep;

    @Steps(shared = true)
    ShoppingCartStep shoppingCartStep;

    @And("agrega productos al carrito de compras")
    public void userAddProducts() {
        selectProductStep.addProduct(3);
    }

    @And("da click en el icono del carrito")
    public void userClickShoppingCartIcon() {
        selectProductStep.clickShoppingCartIcon();
    }


    @Then("el sistema deberia listar los productos agregados al carrito")
    public void systemListProductsAddedShoppingCart(){
        Assert.assertTrue(validationStep.productsAreDisplayed());
    }

    @Then("el sistema deberia mostrar la cesta sin productos")
    public void systemShowEmptyShoppingCart() {
        Assert.assertTrue(validationStep.shoppingIsEmpty());
    }

    @When("completa todo el registro de la orden")
    public void completeRegisterOrden(){
        shoppingCartStep.clickCheckoutButton();
        shoppingCartStep.typeFirstName("AAAA");
        shoppingCartStep.typeLastName("BBB");
        shoppingCartStep.typePostal("CCC");
        shoppingCartStep.clickContinueButton();
        shoppingCartStep.clickFinishButton();
    }

    @Then("el sistema deberia procesar la compra")
    public void systemVisibleOrder(){
        Assert.assertTrue(validationStep.OrderIsVisible());
    }
}
