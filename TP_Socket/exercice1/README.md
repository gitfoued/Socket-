# Exercice 1 : Communication client/serveur avec les Sockets TCP

## Objectif de l'exercice

L'objectif de cet exercice est de développer une application de communication client/serveur utilisant les Sockets TCP en Java.

### Côté serveur

Le côté serveur écoute sur un port spécifié (par exemple, 10000) et accepte les connexions des clients. 
Il lit les messages envoyés par les clients, affiche le contenu et renvoie une réponse au client.
1. **Définition du port d'écoute :** Le programme demande à l'utilisateur de saisir le port d'écoute ou utilise un port par défaut (ici, 1234).

2. **Création du ServerSocket :** Un objet `ServerSocket` est créé et lié au port spécifié, permettant au serveur d'écouter les connexions entrantes.

3. **Attente et acceptation de la connexion :** Le serveur attend qu'un client se connecte à l'aide de la méthode `accept()` du `ServerSocket`. Lorsqu'une connexion est établie, elle est acceptée, créant un nouveau socket pour la communication avec le client.

4. **Création des flux de communication :** Des flux de sortie (`ObjectOutputStream`) et d'entrée (`ObjectInputStream`) sont instanciés pour permettre la transmission d'objets entre le client et le serveur.

5. **Lecture de l'objet envoyé par le client :** Le serveur lit un objet chaîne (dans cet exemple) à partir du flux d'entrée du client.

6. **Affichage des informations reçues :** Les données reçues du client (chaîne dans cet exemple) sont affichées côté serveur.

7. **Affichage des informations sur le client :** Les informations telles que l'adresse IP et le port du client sont affichées.

8. **Réponse au client :** Une réponse (dans cet exemple, "Bien reçu") est renvoyée au client à travers le flux de sortie.

9. **Gestion des erreurs :** Les erreurs éventuelles sont capturées et affichées.
### Côté client
1. **Saisie du nom du serveur et du port :** Le programme demande à l'utilisateur de saisir le nom du serveur et le port auquel se connecter.

2. **Obtention de l'adresse IP du serveur :** À partir du nom du serveur, l'adresse IP du serveur est obtenue à l'aide de `InetAddress`.

3. **Création du Socket client et connexion au serveur :** Un objet `Socket` est créé, se connectant au serveur en utilisant l'adresse IP et le port fournis.

4. **Création des flux de communication :** Des flux de sortie (`ObjectOutputStream`) et d'entrée (`ObjectInputStream`) sont instanciés pour permettre la transmission d'objets entre le client et le serveur.

5. **Envoi d'une chaîne au serveur :** Le client envoie une chaîne au serveur via le flux de sortie.

6. **Lecture d'une chaîne du serveur :** Le client lit une chaîne envoyée par le serveur via le flux d'entrée.

7. **Affichage de la chaîne reçue du serveur :** La chaîne reçue du serveur est affichée côté client.

8. **Gestion des erreurs :** Les erreurs éventuelles sont capturées et affichées.

