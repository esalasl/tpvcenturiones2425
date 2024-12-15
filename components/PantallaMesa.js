import React, { useContext } from "react";
import { View, Text, Button, StyleSheet } from "react-native";
import { MesasContext } from "./MesasContext";
const PantallaMesa = ({ route, navigation }) => {
  const { numeroMesa } = route.params;
  const { mesas } = useContext(MesasContext);

  const mesa = mesas[numeroMesa];

  return (
    <View style={styles.container}>
      <Text style={styles.text}>Mesa: {numeroMesa}</Text>
      <Text style={styles.text}>Productos: {mesa.seleccionados.length}</Text>

      <View style={styles.buttonContainer}>
        <Button
          title="Insertar"
          onPress={() =>
            navigation.navigate("PantallaMenuTipo", { numeroMesa })
          }
        />
        <Button
          title="Comprobar"
          onPress={() =>
            navigation.navigate("PantallaComprobar", { numeroMesa })
          }
        />
        <Button title="Cobrar" onPress={() => alert("Cobrado")} />
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
    backgroundColor: "#f3f7bf",
  },
  text: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 20,
  },
  buttonContainer: {
    marginBottom: 15,
    width: "80%",
  },
});

export default PantallaMesa;
