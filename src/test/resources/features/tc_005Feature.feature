Feature: Validar cierre de sesión

  Scenario: Iniciar sesión, cerrar sesión y verificar acceso denegado a páginas protegidas
    Given que el usuario ha iniciado sesión con credenciales válidas
    When el usuario hace clic en el botón 'Cerrar sesión'
    Then el usuario es redirigido a la página de inicio
    When el usuario intenta acceder a una página protegida
    Then el sistema redirige al usuario a la página de inicio de sesión