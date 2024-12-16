import "react-native-gesture-handler";
import React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";
import PantallaMesa from "./components/PantallaMesa";
import PantallaCobrar  from "./components/PantallaCobrar";
import mesasRefact from "./components/mesasRefact";
import PantallaComanda from "./components/PantallaComanda";
import PantallaMenuTipo from "./components/PantallaTipoDeMenu";
import PantallaComprobar from "./components/PantallaComprobar";
import { MesasProvider } from "./components/MesasContext";

const Stack = createStackNavigator();

export default function App() {
  return (
    <MesasProvider>
      <NavigationContainer>
        <Stack.Navigator initialRouteName="mesasRefact">
          <Stack.Screen
            name="mesasRefact"
            component={mesasRefact}
            options={{ title: "Mesas" }}
          />
          <Stack.Screen
            name="PantallaMesa"
            component={PantallaMesa}
            options={{ title: "Detalle de la Mesa" }}
          />
          <Stack.Screen
            name="PantallaMenuTipo"
            component={PantallaMenuTipo}
            options={{ title: "MENÚS" }}
          />
          <Stack.Screen
            name="PantallaComanda"
            component={PantallaComanda}
            options={{ title: "Comanda" }}
          />
          <Stack.Screen
            name="PantallaComprobar"
            component={PantallaComprobar}
            options={{ title: "Comprobar" }}
          />
          <Stack.Screen
            name="PantallaCobrar"
            component={PantallaCobrar}
            options={{ title: "Cobrar" }}
          />
        </Stack.Navigator>
      </NavigationContainer>
    </MesasProvider>
  );
}
