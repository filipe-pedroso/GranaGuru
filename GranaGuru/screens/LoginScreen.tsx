import React, { useState } from 'react';
import { View, TextInput, Button, Text, StyleSheet } from 'react-native';
import { useNavigation } from '@react-navigation/native';
import { useAuth } from '../contexts/AuthContext';
import { RootStackParamList } from '../navigation/types';  // Importando a tipagem
import { StackNavigationProp } from '@react-navigation/stack';

export default function LoginScreen() {
  const { login } = useAuth();
  const navigation = useNavigation<StackNavigationProp<RootStackParamList, 'Login'>>();  // Tipando o navigation
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const handleLogin = async () => {
    try {
      setError('');
      await login(email, password);
      navigation.navigate('Home');
    } catch (err: any) {
      setError('Erro ao entrar: ' + err.message);
    }
  };

  return (
    <View style={styles.container}>
      <Text style={styles.label}>Email</Text>
      <TextInput
        placeholder="email@email.com"
        value={email}
        onChangeText={setEmail}
        autoCapitalize="none"
        keyboardType="email-address"
        style={styles.input}
      />

      <Text style={styles.label}>Senha</Text>
      <TextInput
        placeholder="********"
        value={password}
        onChangeText={setPassword}
        secureTextEntry
        style={styles.input}
      />

      {error ? <Text style={styles.error}>{error}</Text> : null}

      <Button title="Entrar" onPress={handleLogin} />
      <View style={styles.spacer} />
      <Button title="Cadastrar" onPress={() => navigation.navigate('SignUp' as never)} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 20,
    backgroundColor: '#fff',
  },
  label: {
    marginBottom: 4,
    fontWeight: 'bold',
  },
  input: {
    borderWidth: 1,
    borderColor: '#ccc',
    marginBottom: 12,
    padding: 10,
    borderRadius: 5,
  },
  error: {
    color: 'red',
    marginBottom: 10,
    textAlign: 'center',
  },
  spacer: {
    height: 10,
  },
});
