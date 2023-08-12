#language:es
  Característica: Registro de Usuario
   Yo como usuario quiero registrarme en la pagina de haceb
    para realizar compras.

    @RegistroExitoso
    Escenario: Registro de Usuario exitoso
    Dado que el usuario abre la pagina de haceb
    Cuando se posiciona en perfil y da click en registrarse
    Y da click en ingresar a haceb
    Y completa el formulario de registro datos basicos y se registra
    Y completa el formulario datos adicionales
    Y da click en completar registro
    Entonces el usuario podrá ver un mensaje de bienvenida.