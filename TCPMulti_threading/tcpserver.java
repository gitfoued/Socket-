package TCPMulti_threading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpserver {
    private static final int PORT = 12345;
    private static final int MAX_CLIENTS = 10;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Serveur en attente de connexions...");

            for (int i = 0; i < MAX_CLIENTS; i++) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connecté: " + (i + 1));

                Thread clientHandler = new Thread(new ClientHandler(clientSocket));
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket clientSocket;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

                String inputLine;
                while ((inputLine = reader.readLine()) != null) {
                    // Simuler un traitement en inversant la chaîne de caractères
                    String reversedString = new StringBuilder(inputLine).reverse().toString();

                    // Ajouter un délai avec Thread.sleep (simuler un traitement long)
                    Thread.sleep(2000);

                    // Envoyer la chaîne inversée au client
                    writer.println(reversedString);
                }

                // Fermer les flux et la connexion client
                reader.close();
                writer.close();
                clientSocket.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

