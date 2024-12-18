Feature:  Consulta una orden

  @consultaTienda
  Scenario: consulta

    Given la URL es "https://petstore.swagger.io/v2/store"
    When consulto el numero de la orden "2"
    Then valido que el codigo de respuesta sea 200

  @CrearOrden
  Scenario: Crear Orden

    Given la URL es "https://petstore.swagger.io/v2/store"
    When Creo la orden "600"
    Then  valido que el codigo de respuesta sea 200

