import React from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';

const PantallaMesa = ({ route, navigation }) => {
  const { numeroMesa } = route.params;

  // Funciones para las acciones de los botones
  const handleInsertar = () => {
    console.log(`Insertar en la mesa ${numeroMesa}`);
    // Aquí puedes agregar la lógica para insertar items en la mesa
  };

  const handleComprobar = () => {
    console.log(`Comprobar la mesa ${numeroMesa}`);
    // Aquí puedes agregar la lógica para comprobar la mesa
  };

  const handleCobrar = () => {
    console.log(`Cobrar en la mesa ${numeroMesa}`);
    // Aquí puedes agregar la lógica para cobrar en la mesa
  };

  return (
    <View style={styles.container}>
      <Text style={styles.text}>Detalles de la Mesa {numeroMesa}</Text>

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
    justifyContent: 'center',
    alignItems: 'center',
    padding: 100,
  },
  text: {
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 250,
  },
  buttonContainer: {
    marginBottom: 15, // Espacio entre los botones
    width: '80%', // Controla el ancho de los botones
  },
});

export default PantallaMesa;
