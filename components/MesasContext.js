import React, { createContext, useState } from "react";

const MesasContext = createContext();

export const MesasProvider = ({ children }) => {
  const [ comanda, setComanda] = useState("Comanda inicial");
  

  return (
    <MesasContext.Provider value={{ comanda, setComanda }}>
      {children} 
    </MesasContext.Provider>
  );
};

export default MesasContext;