package TP_Socket.exercice2;

import java.io.*;
import java.net.*;

public class SocketServeur {
    public static void main(String[] args) {
        int port = 12345; // Port d'écoute du serveur
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Serveur en attente de connexion sur le port " + port);

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecté depuis : " + clientSocket.getInetAddress());

            // Créer ObjectInputStream et ObjectOutputStream pour la communication
            ObjectInputStream input = new ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(clientSocket.getOutputStream());

            // Lire l'objet voiture du client
            voiture voiture = (voiture) input.readObject();
            System.out.println("Reçu du client : " + voiture.getCarburant() + " litres de carburant.");

            // Modifier la quantité de carburant côté serveur
            voiture.setCarburant(50);

            // Envoyer la voiture modifiée au client
            output.writeObject(voiture);

            serverSocket.close();
        } catch (Exception e) {
            System.err.println("Erreur côté serveur : " + e);
        }
    }
}

