import React, { useContext } from "react";
import { View, Text, Button, StyleSheet } from "react-native";
import { MesasContext } from './MesasContext';
const PantallaComanda = ({ route }) => {
  const { tipoComanda, numeroMesa } = route.params;
  const { actualizarMesa } = useContext(MesasContext);

  const agregarProducto = (producto) => {
    const productoNuevo = { nombre: producto, cantidad: 1 };
    actualizarMesa(numeroMesa, productoNuevo);
    alert(`Producto agregado a Mesa ${numeroMesa}: ${producto}`);
  };

  return (
    <View style={styles.container}>
      <Text style={styles.text}>Productos: {tipoComanda}</Text>
      <Button title="Agregar Producto" onPress={() => agregarProducto("Tequeños")} />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
    justifyContent: "center",
  },
  text: {
    fontSize: 20,
    fontWeight: "bold",
    marginBottom: 20,
  },
});

export default PantallaComanda;
