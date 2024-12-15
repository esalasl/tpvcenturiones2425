import React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";
import { MesasProvider } from "./components/MesasContext";
import PantallaInicial from "./components/PantallaInicial";
import PantallaMesa from "./components/PantallaMesa";
import PantallaMenuTipo from "./components/PantallaTipoDeMenu";
import PantallaComanda from "./components/PantallaComanda";
import mesasRefact from "./components/mesasRefact";
import PantallaComprobar from "./components/PantallaComprobar";

const Stack = createStackNavigator();

export default function App() {
  return (
    <MesasProvider>
      <NavigationContainer>
        <Stack.Navigator initialRouteName="mesasRefact">
          <Stack.Screen name="mesasRefact" component={mesasRefact} options={{ title: "Mesas " }} />
          <Stack.Screen name="PantallaMesa" component={PantallaMesa} options={{ title: "Detalle de la Mesa" }} />

          <Stack.Screen name="PantallaMenuTipo" component={PantallaMenuTipo} options={{ title: "MENÚS" }} />
          <Stack.Screen name="PantallaComanda" component={PantallaComanda} options={{ title: "Comanda" }} />
          <Stack.Screen name="PantallaComprobar" component={PantallaComprobar} options={{ title: "Comprobar" }} />
        </Stack.Navigator>
      </NavigationContainer>
    </MesasProvider>
  );
}
