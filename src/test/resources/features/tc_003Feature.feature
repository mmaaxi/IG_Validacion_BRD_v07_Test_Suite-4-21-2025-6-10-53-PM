Feature: Recuperación de Contraseña
  Como usuario registrado
  Quiero poder recuperar mi contraseña
  Para poder acceder a mi cuenta cuando la olvide

  Scenario: Validar la funcionalidad de recuperación de contraseña
    Given Estoy en la página de inicio de sesión
    When hago clic en "Olvidé mi contraseña"
    Then debería ser redirigido a la página de recuperación de contraseña
    
    When ingreso un correo electrónico registrado "usuario@correo.com"
    Then el sistema debería aceptar la entrada y validar el formato del correo

    When hago clic en el botón "Enviar"
    Then el sistema debería enviar un correo de recuperación y mostrar un mensaje de confirmación

    When reviso la bandeja de entrada del correo electrónico
    Then debería recibir un correo con instrucciones para recuperar la contraseña