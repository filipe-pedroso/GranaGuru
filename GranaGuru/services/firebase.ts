import { initializeApp } from 'firebase/app';
import { getAuth } from 'firebase/auth';

const firebaseConfig = {
    apiKey: "AIzaSyBOvH9I0a981mq9yua0nlLEpC5EA7ho7M8",
    authDomain: "granaguru-d1fe2.firebaseapp.com",
    projectId: "granaguru-d1fe2",
    storageBucket: "granaguru-d1fe2.firebasestorage.app",
    messagingSenderId: "360099016468",
    appId: "1:360099016468:web:8831077ee3dc4efec89c01"
  };

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

export { auth }