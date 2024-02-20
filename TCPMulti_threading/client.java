package TCPMulti_threading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            // Envoyer une chaîne au serveur
            String messageToServer = "Hello, Server!";
            System.out.println("Envoi au serveur : " + messageToServer);
            writer.println(messageToServer);

            // Recevoir la réponse du serveur
            String serverResponse = reader.readLine();
            System.out.println("Réponse du serveur : " + serverResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

