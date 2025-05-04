import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { AuthProvider } from './contexts/AuthContext'; // Certifique-se de que o caminho está correto
import LoginScreen from './screens/LoginScreen';
import SignUpScreen from './screens/SignUpScreen';
import HomeScreen from './screens/HomeScreen'; // Importar a tela Home

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <AuthProvider>  {/* O AuthProvider deve envolver todo o App */}
      <NavigationContainer>
        <Stack.Navigator screenOptions={{ headerShown: false }}>
          {/* Definindo as rotas principais */}
          <Stack.Screen name="Login" component={LoginScreen} />
          <Stack.Screen name="SignUp" component={SignUpScreen} />
          <Stack.Screen name="Home" component={HomeScreen} /> {/* Página Home referenciada aqui */}
        </Stack.Navigator>
      </NavigationContainer>
    </AuthProvider>
  );
}
