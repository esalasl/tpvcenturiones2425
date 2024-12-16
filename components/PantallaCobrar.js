import React from "react";
import { View, Button, StyleSheet, Text } from "react-native";
import { useContext } from "react";
import MesasContext from "./MesasContext";

const PantallaCobrar = ({ navigation }) => {
  const { comanda, setComanda } = useContext(MesasContext);

  return (
    <View style={styles.container}>
      <Text style={styles.text}>{comanda}</Text> 

      
      <View style={styles.spacer} />

      
      <Button
        style={styles.botones}
        title="Cobrar"
        onPress={() => {setComanda("Comanda cobrada");}}
      />

      
      <View style={styles.separacion} />

     
      <Button
        style={styles.botones}
        title="ATRÁS"
        onPress={() => navigation.goBack()}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
    backgroundColor: "#f3f7bf",
    justifyContent: "flex-start",  
  },
  text: {
    fontSize: 16,
    color: "#666",
    textAlign: "center",
  },
  spacer: {
    flex: 1,  
  },
  separacion: {
    marginVertical: 10, 
  },
  botones: {
    marginBottom: 10,  
    backgroundColor: "#ddd",
    borderRadius: 10,
  },
});

export default PantallaCobrar;