// ModalCantidad
import React, { useState } from 'react';
import { Modal, View, Text, Button, StyleSheet } from 'react-native';

const ModalCantidad = ({ visible, onClose, onSubmit }) => {
  const [cantidad, setCantidad] = useState(0); // Inicializa la cantidad en 0

  const aumentarCantidad = () => {
    setCantidad(cantidad + 1); // Aumenta la cantidad en 1
  };

  const disminuirCantidad = () => {
    if (cantidad > 0) {
      setCantidad(cantidad - 1); // Disminuye la cantidad en 1 si es mayor que 0
    }
  };

  const handleSubmit = () => {
    onSubmit(cantidad); // Llama a la función onSubmit con la cantidad seleccionada
    setCantidad(0); // Reinicia la cantidad
    onClose(); // Cierra el modal
  };

  return (
    <Modal
      animationType="slide"
      transparent={true}
      visible={visible}
      onRequestClose={onClose}
    >
      <View style={styles.modalContainer}>
        <View style={styles.modalContent}>
          <Text style={styles.title}>Selecciona la cantidad</Text>
          <View style={styles.contadorContainer}>
            <Button title="-" onPress={disminuirCantidad} />
            <Text style={styles.cantidadTexto}>{cantidad}</Text>
            <Button title="+" onPress={aumentarCantidad} />
          </View>
          <Button title="Aceptar" onPress={handleSubmit} />
          <Button title="Cancelar" onPress={onClose} />
        </View>
      </View>
    </Modal>
  );
};

const styles = StyleSheet.create({
  modalContainer: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'rgba(0, 0, 0, 0.5)',
  },
  modalContent: {
    width: 300,
    padding: 10,
    justifyContent: 'space-around',
    backgroundColor: 'white',
    borderRadius: 10,
    alignItems: 'center',
  },
  title: {
    fontSize: 20,
    marginBottom: 20,
  },
  contadorContainer: {
    flexDirection: 'row',
    alignItems: 'center',
    marginBottom: 20,
  },
  cantidadTexto: {
    fontSize: 24,
    marginHorizontal: 20,
  },
});


export default ModalCantidad;