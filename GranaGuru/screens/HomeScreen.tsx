import React from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';
import { useNavigation } from '@react-navigation/native';
import { NativeStackNavigationProp } from '@react-navigation/native-stack';
import { useAuth } from '../contexts/AuthContext';
import { RootStackParamList } from '../navigation/types';

type HomeScreenNavigationProp = NativeStackNavigationProp<RootStackParamList, 'Home'>;

export default function HomeScreen() {
  const { user, logout } = useAuth();
  const navigation = useNavigation<HomeScreenNavigationProp>();

  const handleLogout = async () => {
    try {
      await logout();
      navigation.replace('Login'); // Redireciona para a tela de login após o logout
    } catch (err) {
      console.error('Erro ao deslogar:', err);
    }
  };

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Bem-vindo, {user?.email}</Text>
      <Button title="Sair" onPress={handleLogout} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 24,
    backgroundColor: '#fff',
  },
  title: {
    fontSize: 28,
    marginBottom: 24,
    textAlign: 'center',
    fontWeight: 'bold',
  },
});
