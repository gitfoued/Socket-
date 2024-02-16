# TP N°6 : Programmation Réseau avec les Sockets TCP

## Table des matières

1. [Objectifs du TP](#objectifs-du-tp) 🎯
2. [Les Sockets](#les-sockets) 🔌
3. [Exercice 1](exercice1/README.md#exercice-1) 🚀
    - [Côté serveur](exercice1/README.md#côté-serveur) 🖥️
    - [Côté client](exercice1/README.md#côté-client) 🖥️
4. [Exercice 2](exercice2/README.md#exercice-2) 🚗
5.  - [Côté serveur](exercice2/README.md#côté-serveur) 🖥️
    - [Côté client](exercice2/README.md#côté-client) 🖥️
    - [Classe Voiture](exercice2/README.md#classe-voiture) 🏎️
6. [Exercice 3](exercice3/README.md#exercice-3) 📤📥
    - [Côté serveur](exercice3/README.md#côté-serveur) 🖥️
    - [Côté client](exercice3/README.md#côté-client) 🖥️

## Objectifs du TP

Ce TP a pour objectif de manipuler la communication client/serveur via les sockets avec java.

## Les Sockets

Un socket est un point de terminaison dans une communication bidirectionnelle entre deux programmes fonctionnant sur un réseau. 
Il est associé à un numéro de port pour que la couche TCP puisse identifier l’application vers laquelle les données doivent être transmises.

## Exercice 1 🚀

L'exercice 1 consiste à développer un serveur TCP/IP qui écoute sur le port 10000 et accepte des connexions clientes. 
Le programme client se connecte au serveur, lui envoie un message, et le serveur répond.
## Exercice 2🚀
On souhaite échanger entre le client/serveur les objets d’une classe voiture via les sockets.
## Exercice 3🚀

L'application distribuée implique un client envoyant des données sur des personnes au serveur, composées d'un âge (int) et d'un nom (String).
À chaque envoi, le serveur renvoie un identifiant au client en réponse.
