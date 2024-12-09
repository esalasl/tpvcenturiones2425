//HACEMOS TODAS LAS IMPORTACIONES SOBRE LO QUE VAMOS A TRABAJAR
import React, { useState } from "react";
import { View, Text, Image, StyleSheet, TouchableOpacity } from "react-native";
import { useNavigation } from "@react-navigation/native";
import barra from "./img/barra.png";
import mesa from "./img/mesa.png";
import pasillo from "./img/pasillo.png";
import sillaInvertida from "./img/sillaInvertida.png";
import tablaBarra from "./img/tablaBarra.png";
import sillas from "./img/sillas.png";

//TENEMOS UNA VARIABLE A LA CUAL LE PASAMOS ROWS,COLS,LAS IMAGENES Y EL MAPA DE IMAGENES YA DEFINIDO
const RestaurantGrid = ({ rows, cols, imagenesRestaurante, mapaxDefecto }) => {
  const navigation = useNavigation(); //USAMOS NAVIGATION
  const [gridMapa, setGrid] = useState(mapaxDefecto); //TENEMOS ARRAY DE GRIDMAPA, QUE TIENE COMO ESTADO EL MAPA YA DEFINIDO

  //TENEMOS LA ACCION DE HANDLER PARA QUE ESCUCHE LO QUE CLICKEAMOS, EN ESTE TENEMOS UN BOOLEAN ACTIVO, QUE DETECTA UNICAMENTE MESAS,SILLASINVERTIDA O SILLAS, Y HACE LA NAVEGACION A LA PANTALLA DE MENUS
  const handleCeldaClick = (row, col) => {
    const activada = gridMapa[row][col];
    if (
      activada === mesa ||
      activada === sillaInvertida ||
      activada === sillas
    ) {
      navigation.navigate("PantallaMesa", { mesa: { row, col } });
    }
  };

  //TENEMOS UN VIEW DONDE CONTEMPLAMOS TODO LO QUE CONTIENE EL MAPA, EN
  //ESTE CASO USAMOS UN EL GRIDMAP QUE USAMOS UNA ARROWFUNCTION Y LO PASAMOS AL ROW, 
  //PARA ASI MISMO DEFIFINIRLE QUE LLEVA EN ESTE CASO LAS CELDAS Y LA COLUMNA DONDE ESTE

  return (
    <View style={styles.gridContainer}>
      {gridMapa.map((row, rowIndex) =>
        row.map((celdas, colIndex) => (
          <TouchableOpacity
            key={`${rowIndex}-${colIndex}`}
            onPress={() => handleCeldaClick(rowIndex, colIndex)}
            style={styles.celdas}
            //DESABILITAMOS DEL GRID, LA OPCION DEL HANDLER DE LA VARIABLE CELDAS LO QUE SERIAN LOS PASILLOS, LA BARRA Y LA TABLA BARRA PARA QUE CUANDO SE CLIKCKEE NO HAGA NADA
            disabled={
              celdas === pasillo || celdas === tablaBarra || celdas === barra
            }
          >
            {celdas && <Image source={celdas} style={styles.imagenes} />}
          </TouchableOpacity>
        ))
      )}
    </View>
  );
};

//LE PASAMOS A UN CONST LAS IMAGENES CON UNA ARROWFUNCTION QUE LO ABARCA EN UN ARRAY DONDE ESTAN LAS FOTOS QUE ESTAN EN EL MAPA
const ImagenesGrid = () => {
  const imagenesRestaurante = [
    barra,
    mesa,
    sillas,
    pasillo,
    sillaInvertida,
    tablaBarra,
  ];


  //TENEMOS UN CONST QUE ES UN ARRAY DONDE ESTAMOS DEFINIENDO LO QUE ES EL MAPA A GUSTO, SI SE DESEA IMPLEMENTAR UN MAPA DIFERENTE SE TENDRIA QUE EDITAR DESDE CERO
  const mapaxDefecto = [
    [pasillo, pasillo, pasillo, pasillo, pasillo],
    [pasillo, mesa, pasillo, mesa, pasillo],
    [sillas, pasillo, pasillo, pasillo, sillas],
    [sillaInvertida, pasillo, mesa, pasillo, sillaInvertida],
    [pasillo, mesa, pasillo, mesa, pasillo],
    [mesa, pasillo, mesa, pasillo, pasillo],
    [pasillo, pasillo, pasillo, sillas, sillas],
    [mesa, pasillo, pasillo, sillaInvertida, sillaInvertida],
    [barra, barra, barra, barra, barra],
    [tablaBarra, tablaBarra, tablaBarra, tablaBarra, tablaBarra],
  ];

  return (
//EN ESTE VIEW SE CONTEMPLA LO QUE ES TITULO QUE SE MUESTRA EN LO QUE SERIA EL TITULO EN RESTAURANTE LOS NORTEÑOS
//TAMBIÉN DEFINIMOS QUE NUESTRO GRID CONTIENE 10 LINEAS Y 5 COLUMNAS
//LE PASAMOS LA VARIBALE DE LAS IMAGENES Y TAMBIEN EL MAPAXDEFECTO
    <View style={styles.screen}>
      <Text style={styles.restaurante}>RESTAURANTE LOS NORTEÑOS</Text>
      <RestaurantGrid
        rows={10}
        cols={5}
        imagenesRestaurante={imagenesRestaurante}
        mapaxDefecto={mapaxDefecto}
      />
    </View>
  );
};

export default ImagenesGrid;

//ESTILOS PARA NO VINCULAR UNA HOJA DE ESTILOS A PARTE
const styles = StyleSheet.create({
  screen: {
    flex: 1,
    backgroundColor: "#f3f7bf",
    justifyContent: "center", 
    alignItems: "center", 
    padding: 20,
  },
  gridContainer: {
    flexDirection: "row",
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
  restaurante: {
    fontSize: 18,
    fontWeight: "bold",
    textAlign: "center",
    marginBottom: 20,
    color: "#333",
  },
});
