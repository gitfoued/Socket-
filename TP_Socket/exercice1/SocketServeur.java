package TP_Socket.exercice1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SocketServeur {
    public static void main(String argv[]) {
        int port = 10000;
        Scanner keyb = new Scanner(System.in);

        // Récupérer le port d'écoute à partir de la saisie utilisateur
        System.out.print("Port d'écoute : ");
        try {
            port = keyb.nextInt();
        } catch (NumberFormatException e) {
            System.err.println("Le paramètre n'est pas un entier.");
            System.err.println("Usage : java ServeurUDP port-serveur");
            System.exit(-1);
        }

        try {
            // Créer un socket serveur et le lier au port spécifié
            ServerSocket serverSocket = new ServerSocket(port);

            // Attendre qu'un client se connecte et accepter la connexion
            Socket socket = serverSocket.accept();

            // Créer ObjectInputStream et ObjectOutputStream pour la communication
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            // Lire un objet chaîne depuis le client
            String chaine = (String) input.readObject();
            System.out.println("Reçu : " + chaine);

            // Afficher les informations sur le client (adresse IP et port)
            System.out.println("Ça vient de : " + socket.getInetAddress() + ":" + socket.getPort());

            // Envoyer une réponse de retour au client
            output.writeObject(new String("Bien reçu"));
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}

