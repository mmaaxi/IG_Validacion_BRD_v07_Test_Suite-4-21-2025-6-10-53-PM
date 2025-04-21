Feature: Validar límites y validación de campos en formularios

  Scenario: Ingresar datos en un campo con límite inferior al requerido
    Given el usuario está en la página del formulario
    When el usuario ingresa datos insuficientes en el campo
    Then el sistema muestra un mensaje de error por datos insuficientes

  Scenario: Ingresar datos que excedan el límite permitido
    Given el usuario está en la página del formulario
    When el usuario ingresa datos que exceden el límite en el campo
    Then el sistema rechaza la entrada y notifica al usuario sobre el exceso de caracteres