import React, { useState } from "react";
import { View, Button, StyleSheet, Text } from "react-native";

export const PantallaComanda = () => {
  const [seccionSeleccionada, setSeccionSeleccionada] = useState("");

  // opciones temporales
  const opciones = {
    Entrantes: ["Teuqeño", "Nachos"],
    Primeros: ["Sopes", "Huaraches", "Tacos pastor"],
    Segundos: ["Burrito", "Enchilada", "Quesadilla"],
    Postres: ["Helado", "Tarta", "Crep con cajeta"],
    Bebidas: ["Aguas", "Cerveza", "Refresco", "Margarita"],
  };

  const botonesDinamicos = opciones[seccionSeleccionada]?.map((item, index) => (
    <Button key={index} title={item} onPress={() => alert(`Seleccionaste: ${item}`)} />
  ));

  return (
    <View style={estilos.contenedor}>
      <View style={estilos.contenedorBotones}>
        <Button title="Entrantes" onPress={() => setSeccionSeleccionada("Entrantes")} />
        <Button title="Primeros" onPress={() => setSeccionSeleccionada("Primeros")} />
        <Button title="Segundos" onPress={() => setSeccionSeleccionada("Segundos")} />
        <Button title="Postres" onPress={() => setSeccionSeleccionada("Postres")} />
        <Button title="Bebidas" onPress={() => setSeccionSeleccionada("Bebidas")} />
      </View>

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
    backgroundColor: "#fff",
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