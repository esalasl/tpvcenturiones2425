import React, { createContext, useContext, useState, useEffect } from "react";
import AsyncStorage from '@react-native-async-storage/async-storage';

const MesasContext = createContext();

export const MesasProvider = ({ children }) => {
  const [mesas, setMesas] = useState({
    1: { seleccionados: [], cobrado: false },
    2: { seleccionados: [], cobrado: false },
    3: { seleccionados: [], cobrado: false },
    4: { seleccionados: [], cobrado: false },
    5: { seleccionados: [], cobrado: false },
    6: { seleccionados: [], cobrado: false },
  });

  // Cargar las mesas desde AsyncStorage al iniciar la app
  useEffect(() => {
    const cargarMesas = async () => {
      try {
        const mesasGuardadas = await AsyncStorage.getItem("mesas");
        if (mesasGuardadas) {
          setMesas(JSON.parse(mesasGuardadas)); // Cargar los datos almacenados si están disponibles
        }
      } catch (error) {
        console.error("Error al cargar las mesas:", error);
      }
    };

    cargarMesas();
  }, []);

  // Guardar las mesas en AsyncStorage cada vez que cambien
  useEffect(() => {
    const guardarMesas = async () => {
      try {
        await AsyncStorage.setItem("mesas", JSON.stringify(mesas));
      } catch (error) {
        console.error("Error al guardar las mesas:", error);
      }
    };

    guardarMesas();
  }, [mesas]); // Se ejecuta cada vez que el estado de mesas cambia

  // Función para actualizar las mesas
  const actualizarMesa = (numeroMesa, producto) => {
    setMesas((prevMesas) => {
      const mesa = prevMesas[numeroMesa];
      const productoExistente = mesa.seleccionados.find(
        (p) => p.nombre === producto.nombre
      );

      if (productoExistente) {
        productoExistente.cantidad += producto.cantidad;
      } else {
        mesa.seleccionados.push(producto);
      }

      return { ...prevMesas, [numeroMesa]: { ...mesa } };
    });
  };

  return (
    <MesasContext.Provider value={{ mesas, actualizarMesa }}>
      {children}
    </MesasContext.Provider>
  );
};

export const useMesas = () => useContext(MesasContext);
