import React, { createContext, useState } from "react";

// Crea el contexto
const Context = createContext();

// Crea el proveedor del contexto
const AppProvider = ({ children }) => {
  const [numeroMesa, setNumeroMesa] = useState(null); // Ejemplo de estado global
  const [pedidos, setPedidos] = useState([]); // Lista de pedidos

  // para actualizar los pedidos
  const agregarPedido = (pedido) => {
    setPedidos((prevPedidos) => [...prevPedidos, pedido]);
  };

  // para poner los pedidos a cero
  const limpiarPedidos = () => {
    setPedidos([]);
  };

  return (
    <Context.Provider
      value={{
        numeroMesa,
        setNumeroMesa,
        pedidos,
        agregarPedido,
        limpiarPedidos,
      }}
    >
      {children}
    </Context.Provider>
  );
};

export { Context, AppProvider };
