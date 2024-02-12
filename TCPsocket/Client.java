package TCPsocket;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
     public static void main(String[] args) throws Exception{
        //connection
        Socket socket=new Socket("localhost",6789);
          //writing in the socket
          DataOutputStream out =new DataOutputStream(socket.getOutputStream());
          String s="hello";
          out.writeBytes(s+'\n');
          
        //Reading from the socket
        Scanner scan=new Scanner(socket.getInputStream());
        String sentence=scan.nextLine();
        System.out.println("received from server"+sentence);
      
        scan.close();
        socket.close();
       
    }
}
