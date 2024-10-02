Feature: Product - Store
@qastore
  Scenario: Validación del precio de un producto
    Given estoy en la página de la tienda
    When me logueo con mi usuario "frankfox31@gmail.com" y clave "frankfox31@"
    Then valido inicion de sesion "Frank Miranda Marroquin"
    When navego a la categoria "Clothes" y subcategoria "Men"
    And agrego 2 unidades del primer producto al carrito
    Then valido en el popup la confirmación del producto agregado
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito