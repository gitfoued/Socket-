package TP_Socket.exercice1;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SocketClient {
    public static void main(String argv[]) {
        int port = 1234;
        String host = "";
        Scanner keyb = new Scanner(System.in);

        // Demander le nom du serveur à l'utilisateur
        System.out.print("Nom du serveur : ");
        host = keyb.next();

        // Demander le port du serveur à l'utilisateur
        System.out.print("Port du serveur : ");
        try {
            port = keyb.nextInt();
        } catch (NumberFormatException e) {
            System.err.println("Le second paramètre n'est pas un entier.");
            System.exit(-1);
        }

        try {
            // Obtenir l'adresse IP du serveur à partir du nom
            InetAddress adr = InetAddress.getByName(host);

            // Créer un socket client et se connecter au serveur
            Socket socket = new Socket(adr, port);

            // Créer ObjectInputStream et ObjectOutputStream pour la communication
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            // Envoyer une chaîne au serveur
            output.writeObject(new String("Ma première socket"));

            // Lire une chaîne du serveur
            String chaine = (String) input.readObject();
            System.out.println("Reçu du serveur : " + chaine);
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}

