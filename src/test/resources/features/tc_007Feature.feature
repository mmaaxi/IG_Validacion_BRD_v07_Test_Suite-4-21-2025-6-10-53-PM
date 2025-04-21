Feature: Expiración de sesión por inactividad

  Scenario: Validar expiración de sesión por inactividad
    Given el usuario está en la página de inicio de sesión
    When el usuario inicia sesión con credenciales válidas
    Then el usuario debería acceder al sistema
    When el usuario deja la sesión inactiva por un tiempo predeterminado
    Then el sistema debería cerrar la sesión automáticamente y solicitar nuevo login