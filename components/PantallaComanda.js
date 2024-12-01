import React, { useState } from "react";
import { View, Button, StyleSheet, Text, Modal} from "react-native";
import ModalCantidad from "./ModalCantidad";


  // opciones temporales
  const opciones = {
    Entrantes: ["Tequeño", "Nachos"],
    Primeros: ["Sopes", "Huaraches", "Tacos pastor"],
    Segundos: ["Burrito", "Enchilada", "Quesadilla"],
    Postres: ["Helado", "Tarta", "Crep con cajeta"],
    Bebidas: ["Aguas", "Cerveza", "Refresco", "Margarita"],
  };


export const PantallaComanda = ({ route, navigation }) => {
  const { tipoComanda } = route.params;

  const botonesDinamicos = opciones[tipoComanda]?.map((item, index) => (
    <Button key={index} title={item} onPress={() => 
      alert(`Seleccionaste: ${item}`)
    
    } />
  ));

  // Función que se llama al enviar la cantidad desde el modal
  const handleCantidadSubmit = (cantidad) => {
    setCantidadSeleccionada(cantidad); // Actualiza la cantidad seleccionada
    alert(`Cantidad seleccionada: ${cantidad}`); // Muestra un mensaje de alerta con la cantidad seleccionada
  };

  return (
    <View style={estilos.contenedor}>

      <View style={estilos.contenedorDinamico}>
        {botonesDinamicos || <Text style={estilos.texto}>Selecciona una categoría</Text>}
      </View>

      <View style={estilos.contenedorInferior}>
        <Button title="Continuar" onPress={() => alert("Continuar")} />
        <Button title="Finalizar" onPress={() => alert("Finalizar")} />
      </View>

      <Button
        title="ATRÁS"
        onPress={() => navigation.navigate("PantallaMenuTipo")}
        style={estilos.botonAtras}
      />
    </View>
  );
};

const estilos = StyleSheet.create({
  contenedor: {
    flex: 1,
    padding: 20,
    backgroundColor: "#f3f7bf",
    justifyContent: "space-between",
  },
  contenedorBotones: {
    flexDirection: "row",
    justifyContent: "space-around",
    marginVertical: 10,
  },
  contenedorDinamico: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
  texto: {
    fontSize: 16,
    color: "#666",
  },
  contenedorInferior: {
    flexDirection: "row",
    justifyContent: "space-between",
    marginBottom: 10,
  },
  botonAtras: {
    marginTop: 10,
    backgroundColor: "#ddd",
  },
});

export default PantallaComanda;