package TP_Socket.exercice3;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 12345; // Port d'écoute du serveur

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Serveur en attente de connexions sur le port " + port);

            int clientId = 1;

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nouvelle connexion client : " + clientId);

                // Créer ObjectInputStream et ObjectOutputStream pour la communication
                ObjectOutputStream output = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream input = new ObjectInputStream(clientSocket.getInputStream());

                // Lire les informations sur la personne du client
                int age = input.readInt();
                String nom = (String) input.readObject();
                System.out.println("Reçu du client " + clientId + " : Age = " + age + ", Nom = " + nom);

                // Retourner l'identificateur du client au client
                output.writeInt(clientId);
                output.flush();

                clientId++;

                // Fermer la connexion avec le client
                clientSocket.close();
            }
        } catch (Exception e) {
            System.err.println("Erreur côté serveur : " + e);
        }
    }
}

