// Contexto.js
import React, { createContext, useState } from 'react';

export const AppContext = createContext();

export const AppProvider = ({ children }) => {
  const [cantidadSeleccionada, setCantidadSeleccionada] = useState(null);

  return (
    <AppContext.Provider value={{ cantidadSeleccionada, setCantidadSeleccionada }}>
      {children}
    </AppContext.Provider>
  );
};