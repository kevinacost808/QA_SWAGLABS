@Suite @ShoppingCart
Feature: CP02 - Validar carrito de compras

  Background: Realizar 3 validaciones en el carrito de compras
    Given el usuario navega al sitio web
    When ingresa credenciales validas

    @ShoppingCartList
    Scenario: 1 - Listar los productos en los carritos
      And agrega productos al carrito de compras
      And da click en el icono del carrito
      Then el sistema deberia listar los productos agregados al carrito

    @ShoppingCartEmpty
    Scenario: 2 - Cuando la cesta esté vacíade productos, no procesar la compra
      And da click en el icono del carrito
      Then el sistema deberia mostrar la cesta sin productos

    @ShoppingCartProcess
    Scenario: 3 - Cuando se quiera procesar la compra, mostrar un mensaje de compra exitosa
      And agrega productos al carrito de compras
      And da click en el icono del carrito
      When completa todo el registro de la orden
      Then el sistema deberia procesar la compra