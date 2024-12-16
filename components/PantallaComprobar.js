import React, { useContext } from "react";
import { View, Button, StyleSheet, Text } from "react-native";
import { Context } from "./Context";

export const PantallaComprobar = ({ navigation }) => {
  
  const { pedidos, limpiarPedidos } = useContext(Context);
  
  return (
    <View style={estilos.contenedor}>
      <View style={estilos.contenedorDinamico}>
      <Text style={estilos.titulo}>Pedidos de la Mesa</Text>


        {pedidos.length > 0 ? (
          pedidos.map((pedido, index) => (
            // mostrar los pedidod
            <Text key={index} style={estilos.texto}>
              {pedido.plato} - Cantidad: {pedido.cantidad}
            </Text>
          ))
        ) : (
        // mostrar esto si no hay pedidos guardados
        <Text style={estilos.texto}>No hay pedidos.</Text>)}


      </View>

      

      <View style={estilos.contenedorInferior}>
        <Button title="Insertar" onPress={() => navigation.navigate("PantallaMenuTipo")} />
        <Button
          title="Cobrar"
          onPress={() => alert("Cobrar")} // Cambiar a la navegación hacia pantalla "Cobrar" cuando esté disponible
          //onPress={() => navigation.navigate("PantallaCobrar")}
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
  titulo: {
    fontSize: 20,
    fontWeight: "bold",
    marginBottom: 10,
  },
});

export default PantallaComprobar;