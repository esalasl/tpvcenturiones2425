import React from "react";
import { View, Text, Button, StyleSheet } from "react-native";

const PantallaMesa = ({ route, navigation }) => {
  const { numeroMesa } = route.params;

  // Funciones para las acciones de los botones
  const handleInsertar = () => {
    navigation.navigate("PantallaMenuTipo");
  };

  const handleComprobar = () => {
    navigation.navigate("ComprobarComanda");
  };

  const handleCobrar = () => {
    
  };

  // El `return` debe estar aquí, dentro de la función PantallaMesa
  return (
    <View style={styles.container}>
      <Text style={styles.text}>Mesa: {numeroMesa}</Text>

      {/* Botones de las opciones con margen entre ellos */}
      <View style={styles.buttonContainer}>
        <Button title="Insertar" onPress={handleInsertar} />
      </View>
      <View style={styles.buttonContainer}>
        <Button title="Comprobar" onPress={handleComprobar} />
      </View>
      <View style={styles.buttonContainer}>
        <Button title="Cobrar" onPress={handleCobrar} />
      </View>

      {/* Botón para regresar */}
      <View style={styles.buttonContainer}>
        <Button title="Volver a Mesas" onPress={() => navigation.goBack()} />
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    padding: 100,
    backgroundColor: "#f3f7bf"
  },
  text: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 250,
  },
  buttonContainer: {
    marginBottom: 15,
    width: "80%",
  },
});

export default PantallaMesa;
