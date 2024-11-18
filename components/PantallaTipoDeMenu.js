import React, { useState } from "react";
import { View, Text, Button, StyleSheet } from "react-native";

export const PantallaMenuTipo = () => {
  const [seccionSeleccionada, setSeccionSeleccionada] = useState(""); 
 
  const mostrarContenido = () => {
    switch (seccionSeleccionada) {
      case "Entrantes":
        return <Text style={estilos.textoContenido}>Entrantes</Text>;
      case "Primeros":
        return <Text style={estilos.textoContenido}>Primeros</Text>;
      case "Segundos":
        return <Text style={estilos.textoContenido}> Segundos</Text>;
      case "Postres":
        return <Text style={estilos.textoContenido}>Postres</Text>;
      case "Bebidas":
        return <Text style={estilos.textoContenido}>Bebidas</Text>;
      default:
        return <Text style={estilos.textoContenido}>Selecciona una categoria</Text>;
    }
  };

  return (
    <View style={estilos.contenedor}>
      <Text style={estilos.titulo}>Menú</Text>
      <View style={estilos.contenedorBotones}>
        <Button title="Entrantes" onPress={() => setSeccionSeleccionada("Entrantes")} />
        <Button title="Primeros" onPress={() => setSeccionSeleccionada("Primeros")} />
        <Button title="Segundos" onPress={() => setSeccionSeleccionada("Segundos")} />
        <Button title="Postres" onPress={() => setSeccionSeleccionada("Postres")} />
        <Button title="Bebidas" onPress={() => setSeccionSeleccionada("Bebidas")} />
      </View>
      <View style={estilos.contenedorContenido}>{mostrarContenido()}</View>
    </View>
  );
};

const estilos = StyleSheet.create({
  contenedor: {
    flex: 1,
    padding: 20,
    backgroundColor: "#fff",
  },
  titulo: {
    fontSize: 24,
    fontWeight: "bold",
    textAlign: "center",
    marginBottom: 20,
  },
  contenedorBotones: {
    flexDirection: "row",
    justifyContent: "space-around",
    marginBottom: 20,
  },
  contenedorContenido: {
    marginTop: 20,
    alignItems: "center",
  },
  textoContenido: {
    fontSize: 18,
    color: "#333",
  },
});

export default PantallaMenuTipo;