import React, { useState } from "react";
import { View, Text, Image, TouchableOpacity, StyleSheet } from "react-native";


const tipos = ["Entrantes", "Primeros", "Segundos", "Postres", "Bebidas"];


const imagenes = {
  Entrantes: require('./img/entrante.webp'),
  Primeros: require('./img/primeros.jpg'),
  Segundos: require('./img/segundos.webp'),
  Postres: require('./img/postres.png'),
  Bebidas: require('./img/bebidas.png'),

};

export const PantallaMenuTipo = ({ navigation }) => {
  const [seccionSeleccionada, setSeccionSeleccionada] = useState(""); 

  return (
    <View style={estilos.contenedor}>
      <Text style={estilos.titulo}>Menú</Text>
      <View style={estilos.contenedorBotones}>
        {tipos.map((tipo, index) => (
          <TouchableOpacity
            key={index}
            style={estilos.boton}
            onPress={() => navigation.navigate("PantallaComanda", { tipoComanda: tipo })}
          >
            <Image source={imagenes[tipo]} style={estilos.imagenBoton} />
            <Text style={estilos.textoBoton}>{tipo}</Text>
          </TouchableOpacity>
        ))}
      </View>
    </View>
  );
};

const estilos = StyleSheet.create({
  contenedor: {
    flex: 1,
    padding: 20,
    backgroundColor: "#f3f7bf",
    
  },
  titulo: {
    fontSize: 24,
    fontWeight: "bold",
    textAlign: "center",
    marginBottom: 20,
  },
  contenedorBotones: {
    flexDirection: "row",
    flexWrap: "wrap",
    justifyContent: "space-around",
    marginBottom: 20,
  },
  boton: {
    alignItems: "center",
    margin: 10,
  },
  imagenBoton: {
    width: 120,
    height: 120,
    borderRadius: 10,
  },
  textoBoton: {
    marginTop: 10,
    fontSize: 16,
    color: "#333",
  },
});

export default PantallaMenuTipo;