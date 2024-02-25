
# README - Programmation Réseau avec les Sockets UDP
Ce repository contient des exemples de code Java illustrant l'utilisation des sockets UDP pour la communication réseau. Les exercices abordés incluent la transmission de données simples, l'échange d'objets de classe "Voiture", et la mise en place d'un serveur UDP répondant avec la date et l'heure courante.

## Exercice 1 : Communication basique avec les sockets UDP
## Objectif : Comprendre les principes fondamentaux de la communication en mode non connecté avec le protocole UDP en Java.

## Étapes :

Mise en place d'un client UDP qui envoie un datagramme contenant la chaîne "Hello World" à un serveur.
Le serveur UDP reçoit le datagramme, affiche la chaîne reçue, puis renvoie un datagramme contenant "Bien reçu" au client.
## Exercice 2 : Échange d'objets "Voiture" entre client et serveur
## Objectif : Illustrer la sérialisation d'objets Java et leur transmission via des sockets UDP.

## Étapes :

## Définition de la classe "Voiture" avec des méthodes telles que setCarburant.
Le client crée un objet "Voiture", fixe la quantité de carburant, puis envoie l'objet au serveur.
Le serveur reçoit l'objet "Voiture", affiche ses propriétés, et peut éventuellement envoyer une réponse au client.
## Exercice 3 : Serveur UDP retournant la date et l'heure
## Objectif : Mettre en place un serveur UDP capable de retourner la date et l'heure courante à chaque datagramme reçu, indépendamment du contenu.

## Étapes :

Le serveur UDP écoute sur le port 1250.
À la réception de chaque datagramme, le serveur crée un datagramme de réponse contenant la date et l'heure courante.
Le datagramme de réponse est renvoyé à l'émetteur du datagramme initial.
