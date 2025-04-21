Feature: Validar mensajes de error para entradas de datos inválidas

  Scenario: Ingresar caracteres especiales en campos solo numéricos
    Given el usuario está en la página del formulario
    When el usuario ingresa "!@#" en el campo "Número"
    Then el campo "Número" debe rechazar la entrada y mostrar el mensaje de error "Entrada inválida"

  Scenario: Ingresar letras en campos numéricos
    Given el usuario está en la página del formulario
    When el usuario ingresa "abc" en el campo "Número"
    Then el sistema debe mostrar un mensaje de error indicando que la entrada es inválida