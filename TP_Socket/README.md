
# TP N°6 : Programmation Réseau avec les Sockets TCP

## Table des matières

1. [Objectifs du TP](#objectifs-du-tp) 🎯
2. [Les Sockets](#les-sockets) 🔌
3. [Exercice 1](#exercice-1) 🚀
    - [Côté serveur](#côté-serveur) 🖥️
    - [Côté client](#côté-client) 🖥️
    - [Commentaires](#commentaires) 💬
4. [Exercice 2](#exercice-2) 🚗
    - [Classe Voiture](#classe-voiture) 🏎️
    - [Commentaires](#commentaires-1) 💬
5. [Exercice 3](#exercice-3) 📤📥
    - [Commentaires](#commentaires-2) 💬
6. [Dossiers additionnels](#dossiers-additionnels) 📁


## Objectifs du TP

Ce TP a pour objectif de manipuler la communication client/serveur via les sockets avec Java.

## Les Sockets

Un socket est un point de terminaison dans une communication bidirectionnelle entre deux programmes fonctionnant sur un réseau. Il est associé à un numéro de port pour que la couche TCP puisse identifier l’application vers laquelle les données doivent être transmises.

## Exercice 1

L'exercice 1 consiste à développer un serveur TCP/IP qui écoute sur le port 10000 et accepte des connexions clientes. Le programme client se connecte au serveur, lui envoie un message, et le serveur répond.

### Côté serveur :

```java
// Insérez le code du serveur ici

