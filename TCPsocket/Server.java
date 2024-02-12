package TCPsocket;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;
public class Server {
    public static void main(String[] args) throws Exception{
        //connection
        ServerSocket serverSocket=new ServerSocket(6789);
        Socket socket=serverSocket.accept();
        System.out.println("connexion etablie");
        //Reading from the socket
        Scanner scan=new Scanner(socket.getInputStream());
        String sentence=scan.nextLine();
        System.out.println("received from clients"+sentence);
        //writing in the socket
        DataOutputStream out =new DataOutputStream(socket.getOutputStream());
        String s="hello";
        out.writeBytes(s+'\n');
        scan.close();
        socket.close();
       
    }
}
