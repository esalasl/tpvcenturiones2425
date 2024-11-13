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
  pantallaInicial: {
    flex: 1,
    justifyContent: 'center', // Centra verticalmente
    alignItems: 'center',     // Centra horizontalmente
  },
  opciones: {
    marginBottom: 50, // Ajusta el margen para que no ocupe tanto espacio
  },
  grid: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    justifyContent: 'space-around',
    width: '80%', // Ajusta el ancho del grid para centrar mejor
  },
  botonMesa: {
    width: buttonWidth,
    height: buttonWidth,
    marginVertical: 10, // Añade margen vertical entre los botones
  },
  textoOpciones: {
    fontSize: 30,
    fontWeight: 'bold',
    color: 'white',
    backgroundColor: 'red',
    paddingHorizontal: 10,
    paddingVertical: 5,
    textAlign: 'center',
  },
});