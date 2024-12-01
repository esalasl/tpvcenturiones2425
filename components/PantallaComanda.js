import React, { useState } from "react";
import { View, Button, StyleSheet, Text} from "react-native";
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


export const PantallaComanda = ({ route, navigation }) => {
  const { tipoComanda } = route.params;
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

  return (
    <View style={estilos.contenedor}>

      <View style={estilos.contenedorDinamico}>
        {botonesDinamicos || <Text style={estilos.texto}>Selecciona una categoría</Text>}
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