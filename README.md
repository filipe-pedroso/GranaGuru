# 💰 GranaGuru - App de Gestão Financeira Pessoal

Aplicativo de controle financeiro pessoal feito com **React Native**, com foco em usabilidade, clareza e insights inteligentes para o dia a dia financeiro.

Desenvolvido por **Filipe Pedroso**

🔗 Repositório: [github.com/filipe-pedroso/GranaGuru](https://github.com/filipe-pedroso/GranaGuru)

---

## 📦 Estrutura de Pastas

```plaintext
GranaGuru/
├── assets/         # Imagens, ícones e fontes
├── components/     # Componentes reutilizáveis (cards, botões, inputs)
├── screens/        # Telas principais do app (Login, Dashboard, etc.)
├── navigation/     # Lógica de navegação (React Navigation)
├── services/       # APIs, autenticação, integração com banco
├── contexts/       # Estados globais com Context API ou Zustand
├── hooks/          # Hooks customizados (ex: useTransactions)
├── utils/          # Funções auxiliares (formatação, cálculos)
├── config/         # Estilos globais, temas, variáveis
├── models/         # Tipagens e modelos (TypeScript)
├── database/       # Integração com SQLite, Realm ou Firebase
├── App.tsx         # Ponto de entrada da aplicação
└── package.json

---

## 🧠 Funcionalidades

### 🔐 Autenticação
- Login com e-mail/senha, Google ou biometria
- Recuperação de senha
- Sessão persistente com token seguro

### 📊 Dashboard
- Saldo total
- Entradas e saídas recentes
- Gráficos interativos (pizza, barra)
- Comparativo mensal

### 💸 Transações
- Cadastro de novas transações
- Categorização (alimentação, transporte, etc.)
- Parcelamento e recorrência
- Edição e exclusão

### 🎯 Metas Financeiras
- Criação de objetivos (ex: economizar R$1000)
- Acompanhamento de progresso
- Notificações de alerta

### 📈 Relatórios
- Exportação para PDF/Excel
- Análises mensais por categoria
- Dicas e alertas com IA (em desenvolvimento)

---

## ⚙️ Tecnologias Utilizadas

| Função                     | Ferramenta                     |
|---------------------------|--------------------------------|
| Frontend                  | React Native (Expo ou Bare)    |
| Estado global             | Context API / Zustand          |
| Backend (opcional)        | Firebase / Node.js + Express   |
| Banco local               | SQLite / Realm / AsyncStorage  |
| Autenticação              | Firebase Auth / JWT            |
| Gráficos                  | Victory / Recharts             |
| Testes                    | Jest / Detox                   |
| Navegação                 | React Navigation               |
| Estilização               | Styled Components / NativeWind|

---

## 🔐 Segurança
- Criptografia local dos dados sensíveis
- Armazenamento seguro (SecureStore / Keychain)
- Validação de entrada e erros

---

## 🧪 Testes
- **Testes unitários:** Jest
- **Testes E2E:** Detox
- **Beta testing:** TestFlight (iOS) e APK (Android)

---

## 📤 Deploy e Build
- Build Android: `eas build -p android`
- Build iOS: `eas build -p ios` *(necessário Mac ou EAS Build)*
- Publicação: Google Play Console / Apple App Store

---

## 📌 Futuras Implementações
- Sincronização multi-dispositivo
- Reconhecimento de recibos via OCR
- Análise preditiva com IA
- Integração com bancos via Open Finance

---

## 📄 Licença
MIT © Filipe Pedroso
