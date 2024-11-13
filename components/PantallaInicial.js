import React from 'react';
import { View, Button, Text, StyleSheet, Dimensions, ImageBackground } from 'react-native';

const screenWidth = Dimensions.get('window').width;
const buttonWidth = screenWidth / 3 - 30;

// Ruta de la imagen de fondo (asegúrate de tener esta imagen en tu proyecto o usa una URL)
const backgroundImage = { uri: 'https://www.example.com/path/to/your/background-image.jpg' };

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
    <ImageBackground source={backgroundImage} style={styles.background}>
      <View style={styles.pantallaInicial}>
        <View style={styles.opciones}>
          <Text style={styles.textoOpciones}>TPV-CENTURIONES</Text>
        </View>
        <View style={styles.grid}>
          <BotonMesa numero={1} onSeleccionarMesa={seleccionarMesa} />
          <BotonMesa numero={2} onSeleccionarMesa={seleccionarMesa} />
          <BotonMesa numero={3} onSeleccionarMesa={seleccionarMesa} />
          <BotonMesa numero={4} onSeleccionarMesa={seleccionarMesa} />
          <BotonMesa numero={5} onSeleccionarMesa={seleccionarMesa} />
          <BotonMesa numero={6} onSeleccionarMesa={seleccionarMesa} />
          <BotonMesa numero={7} onSeleccionarMesa={seleccionarMesa} />
          <BotonMesa numero={8} onSeleccionarMesa={seleccionarMesa} />
          <BotonMesa numero={9} onSeleccionarMesa={seleccionarMesa} />
        </View>
      </View>
    </ImageBackground>
  );
};

const styles = StyleSheet.create({
  background: {
    flex: 1,
    resizeMode: 'cover', // Ajusta la imagen para que cubra todo el fondo
  },
  pantallaInicial: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  opciones: {
    marginBottom: 20,
  },
  grid: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    justifyContent: 'space-around',
    width: '80%',
  },
  botonMesa: {
    width: buttonWidth,
    height: buttonWidth,
    marginVertical: 10,
  },
  textoOpciones: {
    fontSize: 30,
    color: 'white',
    backgroundColor: 'red',
    paddingHorizontal: 10,
    paddingVertical: 5,
    textAlign: 'center',
  },
});

export default PantallaInicial;

