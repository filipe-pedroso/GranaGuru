import React, { createContext, useState, useContext, ReactNode } from 'react';
import { createUserWithEmailAndPassword, signInWithEmailAndPassword, User } from 'firebase/auth';
import { auth } from '../services/firebase'; // Caminho correto para o arquivo de configuração do Firebase

// Define o tipo de dados para o contexto
type AuthContextType = {
  user: User | null;
  login: (email: string, password: string) => Promise<void>;
  register: (email: string, password: string) => Promise<void>;
  logout: () => Promise<void>;  // Adiciona a função logout
};

const AuthContext = createContext<AuthContextType>({} as AuthContextType);

export const AuthProvider = ({ children }: { children: ReactNode }) => {
  const [user, setUser] = useState<User | null>(null);

  async function login(email: string, password: string) {
    const res = await signInWithEmailAndPassword(auth, email, password);
    setUser(res.user);
  }

  async function register(email: string, password: string) {
    const res = await createUserWithEmailAndPassword(auth, email, password);
    setUser(res.user);
  }

  async function logout() {
    await auth.signOut(); // Chama a função de logout do Firebase
    setUser(null);
  }

  return (
    <AuthContext.Provider value={{ user, login, register, logout }}>
      {children}
    </AuthContext.Provider>
  );
};

// Hook customizado para acessar o contexto
export const useAuth = () => useContext(AuthContext);
