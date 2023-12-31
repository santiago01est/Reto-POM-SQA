#language:es
  Característica: Agregar un producto al carrito de compras
    Yo como usuario quiero seleccionar un producto de una categoria
    para agregarlo al carrito.

    @ProductoAgregadoExitoso
    Escenario: Agregar un producto de forma exitosa al carrito de compras
      Dado que el usuario abre la pagina del haceb
      Cuando el usuario selecciona una categoria
      Y selecciona una subcategoria de forma aleatoria
      Y da click a un producto de forma aleatoria
      Y agrega el producto al carrito
      Cuando va al carrito
      Entonces el usuario podrá ver el nombre producto en el carrito.
