import React, { useState } from 'react';
import { View, Button, Text, StyleSheet, Dimensions } from 'react-native';

const screenWidth = Dimensions.get('window').width;
const buttonWidth = screenWidth / 3 - 30;

const BotonMesa = ({ numero, onSeleccionarMesa }) => {
  return (
    <View style={styles.botonMesa}>
      <Button title={`Mesa ${numero}`} onPress={() => onSeleccionarMesa(numero)} />
    </View>
  );
};

const PantallaInicial = ({ navigation }) => {
  const seleccionarMesa = (numero) => {
    navigation.navigate('PantallaMesa', { numeroMesa: numero });
  };

  return (
    <View style={styles.pantallaInicial}>
      <View style={styles.opciones}>
      <Text style={styles.textoOpciones}>TPV-CENTURIONES</Text>
      </View>
      <View style={styles.grid}>
        <BotonMesas numero={1} onSeleccionarMesa={seleccionarMesa} />
        <BotonMesas numero={2} onSeleccionarMesa={seleccionarMesa} />
        <BotonMesas numero={3} onSeleccionarMesa={seleccionarMesa} />
        <BotonMesas numero={4} onSeleccionarMesa={seleccionarMesa} />
        <BotonMesas numero={5} onSeleccionarMesa={seleccionarMesa} />
        <BotonMesas numero={6} onSeleccionarMesa={seleccionarMesa} />
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  pantallaInicial: {
    flex: 1,
    alignItems: 'center',
    padding: 20,
  },
  opciones: {
    marginBottom: 150,
  },
  grid: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    justifyContent: 'space-around',
  },
  botonMesa: {
    width: buttonWidth,
    height: buttonWidth,
    margin: 10,
  },
  textoOpciones: {
    fontSize: 30,
}
});

export default PantallaInicial;
