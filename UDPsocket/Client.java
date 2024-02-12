package UDPsocket;
import java.net.*;

public class Client{
    public static void main(String[] args) throws Exception {
        
        //creation de socket
        int port=3333;
        DatagramSocket socket_client=new DatagramSocket(port);
        //creation du packet
        InetAddress addresse_server=InetAddress.getByName("localhost");//pour recuperer @ip de server a partir de son nom
        int server_port=1234;
        String s="hello i am the client";
        DatagramPacket packet=new DatagramPacket(s.getBytes(),s.length(),addresse_server,server_port);
        //send the packet
        socket_client.send(packet);

        socket_client.close();
    }
}