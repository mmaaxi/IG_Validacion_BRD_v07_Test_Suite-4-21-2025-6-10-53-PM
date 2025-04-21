Feature: Validación de mensaje de error con credenciales incorrectas

  Scenario: El usuario ingresa credenciales inválidas y recibe un mensaje de error
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa un nombre de usuario inválido
    And el usuario ingresa una contraseña incorrecta
    And el usuario hace clic en el botón 'Iniciar sesión'
    Then el sistema muestra un mensaje de error indicando 'Credenciales incorrectas'