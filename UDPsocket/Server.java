package UDPsocket;
import java.net.*;
import java.util.*;
import java.io.*;
public class Server{
    public static void main(String[] args) throws Exception {
        
        //creation de socket
        int port=1234;
        DatagramSocket socket_server=new DatagramSocket(port);

        //recoit le paquet
        byte [] buf=new byte[256];
        DatagramPacket packet=new DatagramPacket(buf, buf.length);
        System.out.println("server is ready to receive packets ");
        socket_server.receive(packet);
        //lire le paquet
        String s=new String(packet.getData(),0,packet.getLength());
        System.out.println("the container of the packet " +s);
        //recuperer les informations du client
        InetAddress client_addresse=packet.getAddress();
        int client_port=packet.getPort();
        System.out.println(client_addresse);
        System.out.println(client_port);
        //envoyer msg au client si tu veux 
        /*String reponse="message a ete recupere";
        DatagramPacket packet_response=new DatagramPacket(reponse.getBytes(),reponse.length(),client_addresse, client_port);
        socket_server.send(packet_response);*/
        //fermer la socket
        socket_server.close();
    }
}