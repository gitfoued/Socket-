package TP_Socket.exercice2;

import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {
        String serverHost = "localhost"; // Adresse IP ou nom d'hôte du serveur
        int serverPort = 12345; // Port du serveur
        try {
            Socket socket = new Socket(serverHost, serverPort);

            // Créer ObjectInputStream et ObjectOutputStream pour la communication
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            // Créer une voiture et l'envoyer au serveur
            voiture voiture = new voiture("Berline", "Modèle XYZ");
            output.writeObject(voiture);

            // Lire la voiture modifiée du serveur
            voiture voitureModifiee = (voiture) input.readObject();
            System.out.println("Reçu du serveur : " + voitureModifiee.getCarburant() + " litres de carburant.");

            socket.close();
        } catch (Exception e) {
            System.err.println("Erreur côté client : " + e);
        }
    }
}


