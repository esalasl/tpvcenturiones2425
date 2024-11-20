import React, { useState } from "react";
import { View, Text, Button, StyleSheet } from "react-native";

//array de tipos de comida y recorrerlo cuando se haga click para mostrar mi pantalla
const tipos = ["Entrantes", "Primeros", "Segundos", "Postres", "Bebidas"];


export const PantallaMenuTipo = ({ navigation }) => {
  const [seccionSeleccionada, setSeccionSeleccionada] = useState(""); 

return (
    <View style={estilos.contenedor}>
      <Text style={estilos.titulo}>Menú</Text>
      <View style={estilos.contenedorBotones}>
        {tipos.map((tipo, index) =>
          <Button key={index} title={tipo} onPress={() => navigation.navigate("PantallaComanda", { tipoComanda: tipo })} />
          )}
      </View>
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