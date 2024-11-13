import 'react-native-gesture-handler';
import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import PantallaInicial from './components/PantallaInicial';
import PantallaMesa from './components/PantallaMesa'; // Nueva pantalla para mostrar detalles de cada mesa

const Stack = createStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator initialRouteName="PantallaInicial">
        <Stack.Screen name="PantallaInicial" component={PantallaInicial} options={{ title: 'Mesas' }} />
        <Stack.Screen name="PantallaMesa" component={PantallaMesa} options={{ title: 'Detalle de la Mesa' }} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}