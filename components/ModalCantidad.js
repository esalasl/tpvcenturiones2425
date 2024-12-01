import React, { useState } from 'react';
import { Modal, View, Text, Button, TextInput, StyleSheet } from 'react-native';

const ModalCantidad = ({ visible, onClose, onSubmit }) => {
  const [cantidad, setCantidad] = useState('');

  const handleSubmit = () => {
    onSubmit(cantidad);
    setCantidad('');
    onClose();
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
          <TextInput
            style={styles.input}
            keyboardType="numeric"
            value={cantidad}
            onChangeText={setCantidad}
            placeholder="Cantidad"
          />
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
    padding: 20,
    backgroundColor: 'white',
    borderRadius: 10,
    alignItems: 'center',
  },
  title: {
    fontSize: 20,
    marginBottom: 20,
  },
  input: {
    width: '100%',
    borderWidth: 1,
    borderColor: '#ccc',
    borderRadius: 5,
    padding: 10,
    marginBottom: 20,
  },
});

export default ModalCantidad;