import React from "react";
import { View, Button, StyleSheet, Text } from "react-native";

export const PantallaComprobar = ({ navigation }) => {
  return (
    <View style={estilos.contenedor}>
      <View style={estilos.contenedorDinamico}>
        <Text style={estilos.texto}>Aquí se muestran los botones</Text>
      </View>

      <Text style={estilos.cantidadTexto}>
        {/* Ejemplo de texto, puedes actualizar con datos reales */}
        Cantidad Seleccionada: Ninguna
      </Text>

      <View style={estilos.contenedorInferior}>
        <Button title="Insertar" onPress={() => navigation.navigate("PantallaMenuTipo")} />
        <Button
          title="Cobrar"
          onPress={() => alert("Cobrar")} // Cambiar a la navegación hacia pantalla "Cobrar" cuando esté disponible
        />
      </View>

      <Button
        title="ATRÁS"
        onPress={() => navigation.navigate("mesasRefact")}
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
  contenedorDinamico: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
  texto: {
    fontSize: 16,
    color: "#666",
    textAlign: "center",
  },
  cantidadTexto: {
    fontSize: 18,
    color: "#333",
    marginBottom: 20,
    textAlign: "center",
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

export default PantallaComprobar;