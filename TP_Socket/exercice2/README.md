# Exercice 1 :   Échange d'objets Voiture

## Objectif de l'exercice

L'exercice consiste à échanger des objets de la classe `Voiture` entre le client et le serveur via les sockets. Le client crée un objet `Voiture`, ajuste la quantité de carburant à l'aide de la méthode `setCarburant()`, puis envoie cet objet au serveur. Le serveur peut ensuite manipuler l'objet `Voiture`.
## Classe Voiture

La classe `Voiture` représente une entité voiture avec des propriétés telles que le carburant, le modèle et le type.
Elle implémente l'interface `Serializable` pour permettre la sérialisation des objets lors de leur transmission via les sockets TCP.

### Propriétés

- `carburant` : Quantité de carburant actuelle de la voiture.
- `model` : Modèle de la voiture.
- `type` : Type de la voiture.
- `capacite` : Capacité maximale du réservoir de carburant (constante).

### Méthodes

- `voiture(String _type, String _model)`: Constructeur de la classe permettant d'initialiser les propriétés.
- `setCarburant(int c)`: Méthode pour fixer la quantité de carburant de la voiture.
- `getCarburant()`: Méthode pour obtenir la quantité actuelle de carburant.
- `getCapacite()`: Méthode pour obtenir la capacité maximale du réservoir de carburant.


### Côté serveur

1. **Création du serveur :** Un serveur socket est créé, écoutant sur un port spécifié (12345 par défaut).
2. **Attente de connexion :** Le serveur attend la connexion d'un client.
3. **Communication avec le client :** ObjectInputStream et ObjectOutputStream sont créés pour la communication avec le client.
4. **Réception de l'objet Voiture :** L'objet Voiture est reçu du client via ObjectInputStream.
5. **Modification côté serveur :** La quantité de carburant de la voiture est modifiée côté serveur.
6. **Envoi de l'objet modifié :** L'objet Voiture modifié est renvoyé au client via ObjectOutputStream.
7. **Fermeture du serveur :** Une fois la communication terminée, le serveur se ferme.

### Côté client

1. **Création du client :** Un socket client est créé pour se connecter au serveur sur une adresse IP (localhost par défaut) et un port spécifiés (12345 par défaut).
2. **Communication avec le serveur :** ObjectInputStream et ObjectOutputStream sont créés pour la communication avec le serveur.
3. **Création de l'objet Voiture :** Une instance de la classe `voiture` est créée avec les informations nécessaires.
4. **Envoi de l'objet au serveur :** L'objet Voiture est envoyé au serveur via ObjectOutputStream.
5. **Réception de l'objet modifié :** L'objet Voiture modifié est reçu du serveur via ObjectInputStream.
6. **Affichage des informations :** Les informations de la voiture modifiée sont affichées côté client.


