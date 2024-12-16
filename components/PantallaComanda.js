import React, { useState } from "react";
import { View, Button, StyleSheet, Text, TouchableOpacity, Image  } from "react-native";
import ModalCantidad from "./ModalCantidad";


  // opciones temporales
  const opciones = {
    Entrantes: ["Tequeño", "Nachos", "Chilaquiles"],
    Primeros: ["Sopes", "Huaraches", "Tacos pastor"],
    Segundos: ["Burrito", "Enchilada", "Quesadilla"],
    Postres: ["Helado", "Tarta", "Crep con cajeta"],
    Bebidas: ["Aguas", "Cerveza", "Margarita"],
  };

  // esto es lo de noel, lo tengo que adaptar a mis opciones
  /*const imagenes = {
    Entrantes: require('./img/entrante.webp'),
    Primeros: require('./img/primeros.jpg'),
    Segundos: require('./img/segundos.webp'),
    Postres: require('./img/postres.png'),
    Bebidas: require('./img/bebidas.png'),
  };*/

  //////////////
  const imagenesPlatos = {
    Tequeño: require("./img/tequeno.jpg"),
    Nachos: require("./img/entrante.webp"),
    Chilaquiles: require("./img/chilaquiles.jpg"),
    Sopes: require("./img/sopes.jpeg"),
    Huaraches: require("./img/huarache.jpg"),
    "Tacos pastor": require("./img/tacosPastor.jpg"),
    Burrito: require("./img/segundos.webp"),
    Enchilada: require("./img/enchilada.jpg"),
    Quesadilla: require("./img/quesadilla.jpg"),
    Helado: require("./img/helado.jpeg"),
    Tarta: require("./img/tarta.jpg"),
    "Crep con cajeta": require("./img/crep.jpg"),
    Aguas: require("./img/aguas.jpg"),
    Cerveza: require("./img/cerveza.jpg"),
    Margarita: require("./img/margarita.jpg"),
  };
  /////////////



export const PantallaComanda = ({ route, navigation }) => {
  const { tipoComanda } = route.params;
  const [platoSeleccionado, setPlatoSeleccionado] = useState(null);
  const [modalVisible, setModalVisible] = useState(false); // Controla la visibilidad del modal
  const [cantidadSeleccionada, setCantidadSeleccionada] = useState(null); // Almacena la cantidad seleccionada

  // Función que se llama al enviar la cantidad desde el modal
  const handleCantidadSubmit = (cantidad) => {
    setCantidadSeleccionada(cantidad); // Actualiza la cantidad seleccionada
    alert(`Cantidad seleccionada: ${cantidad}`); // Muestra un mensaje de alerta con la cantidad seleccionada
  };

  // Crear botones dinámicos que abren el modal
  const botonesDinamicos = opciones[tipoComanda]?.map((item, index) => (
    <Button key={index} title={item} onPress={() => setModalVisible(true)} />
  ));
  const handleAbrirModal = (plato) => {
    setPlatoSeleccionado(plato);
    setModalVisible(true);
  };

  return (
    <View style={estilos.contenedor}>

<View style={estilos.listaPlatos}>
        {opciones[tipoComanda]?.map((plato, index) => (
          <TouchableOpacity
            key={index}
            style={estilos.cardPlato}
            onPress={() => handleAbrirModal(plato)}
          >
            <Image source={imagenesPlatos[plato]} style={estilos.imagenPlato} />
            <Text style={estilos.nombrePlato}>{plato}</Text>
          </TouchableOpacity>
        ))}
      </View>

      <Text style={estilos.cantidadTexto}>
        Cantidad Seleccionada: {cantidadSeleccionada !== null ? cantidadSeleccionada : "Ninguna"}
      </Text>

      {/* Modal para seleccionar la cantidad */}
      <ModalCantidad
        visible={modalVisible} // Controla si el modal es visible
        onClose={() => setModalVisible(false)} // Cierra el modal
        onSubmit={handleCantidadSubmit} // Envía la cantidad seleccionada al manejar la función
      />

      <View style={estilos.contenedorInferior}>
        <Button title="Continuar" onPress={() => navigation.navigate("PantallaMenuTipo")} />
        <Button title="Finalizar" onPress={() =>navigation.navigate("mesasRefact")} />
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
  listaPlatos: {
    flexDirection: "row",
    flexWrap: "wrap",
    justifyContent: "space-around",
  },
  cardPlato: {
    alignItems: "center",
    margin: 10,
    borderWidth: 1,
    borderColor: "#ddd",
    borderRadius: 10,
    padding: 10,
    backgroundColor: "#fff",
  },
  imagenPlato: {
    width: 100,
    height: 100,
    borderRadius: 8,
  },
  nombrePlato: {
    marginTop: 10,
    fontSize: 14,
    fontWeight: "bold",
  },
});

export default PantallaComanda;
