### Serveur TCP pour le traitement de 10 clients en parallèle

## Description
Ce projet est un exemple de serveur TCP simple qui peut traiter jusqu'à 10 clients en parallèle. Chaque client envoie une chaîne de caractères au serveur, qui inverse ensuite la chaîne et renvoie le résultat au client. Un délai avec `Thread.sleep` est ajouté pour bloquer le client en attente.

## Fonctionnement
Le serveur écoute sur le port 12345.
Lorsqu'un client se connecte, le serveur accepte la connexion et crée un thread dédié (ClientHandler) pour gérer ce client.
Le ClientHandler utilise BufferedReader pour lire la chaîne de caractères envoyée par le client.
Ensuite, le serveur inverse la chaîne de caractères, ajoute un délai avec Thread.sleep pour simuler un traitement, puis utilise PrintWriter pour renvoyer la chaîne inversée au client.
La connexion du client est fermée proprement après le traitement.

