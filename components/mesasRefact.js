import React, { useState } from "react";
import { View, Text, Image, StyleSheet, TouchableOpacity, Button } from "react-native";
import barra from "./img/barra.png";
import mesa from "./img/mesa.png";
import pasillo from "./img/pasillo.png";
import sillaInvertida from "./img/sillaInvertida.png";
import tablaBarra  from "./img/tablaBarra.png";
import sillaLateral from "./img/SillaLateral.png";
import sillaIzquierda from "./img/SillaIzquierda.png";
import sillas from "./img/sillas.png";



const RestaurantGrid = ({ rows, cols, images }) => {
  const [grid, setGrid] = useState(
    Array(rows)
      .fill(null)
      .map(() => Array(cols).fill(null)) // Inicializa la grid con celdas vacías
  );

 {/*<View>
    <View style={styles.container}>
        <Button title="Guardar" onPress={handleGuardar} />
    </View>
    <View style={styles.container}>
        <Button title="Cancelar" onPress={handleCancelar} />
    </View>
    <View style={styles.container}>
        <Button title="Agregar" onPress={handleAgregar} />
    </View>
 </View>*/}


  const handleCeldaClick = (row, col) => {
    setGrid((prevGrid) => {
      const newGrid = [...prevGrid];
      const currentIndex = images.indexOf(newGrid[row][col]);
      newGrid[row][col] = images[(currentIndex + 1) % images.length];
      return newGrid;
    });
  };

  return (
    <View style={styles.container}>
      {grid.map((row, rowIndex) =>
        row.map((celdas, colIndex) => (
          <TouchableOpacity
            key={`${rowIndex}-${colIndex}`}
            onPress={() => handleCeldaClick(rowIndex, colIndex)}
            style={styles.celdas}
          >
            {celdas && (
  <Image
    source={celdas}
    style={styles.imagenes}
  />
)}
          </TouchableOpacity>
        ))
      )}
    </View>
  );
};

const ImagenesGrid = () => {
  const images = [barra, mesa, sillas, pasillo,sillaInvertida,sillaLateral,tablaBarra,sillaIzquierda];
  return (
    <View style={styles.screen}>
      <Text style={styles.title}>Mapa de Mesas del Restaurante</Text>
      <RestaurantGrid rows={10} cols={5} images={images} />
    </View>
  );
};

export default ImagenesGrid;

// Estilos
const styles = StyleSheet.create({
  screen: {
    flex: 1,
    backgroundColor: "#f5f5f5",
    justifyContent: "center", // Centra el contenido verticalmente
    alignItems: "center", // Centra el contenido horizontalmente
    padding: 20,
  },
  container: {
   flex:1,flexDirection: "row",
   flexWrap: "wrap",
   justifyContent: "flex-start",
   width: "100%",
  },
  celdas: {
    width: 80,
    height: 80,
    alignItems: "center",
    justifyContent: "center",

  },
  imagenes: {
    width: "100%",
    height: "100%",
  },
  placeholder: {
    color: "#bbb",
    fontSize: 14,
  },
  title: {
    fontSize: 18,
    fontWeight: "bold",
    textAlign: "center",
    marginBottom: 20,
    color: "#333",
  },
});
