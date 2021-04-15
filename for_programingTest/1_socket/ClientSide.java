import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientSide {
  public static void main(String[] args) {
    try {
      String host;
      if (args.length>0) {
        host=args[0];
      } else {
        host="localhost";
      }

      Socket socket=new Socket(host, 8008);
      
      BufferedReader in
          = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      PrintWriter out
          = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
      
      Scanner scanner = new Scanner(System.in);
      String msg = "";
      // send data to the server
      for (;;) {
    	  System.out.println("Write a Message to Server");
    	  msg = scanner.nextLine();
    	  out.println(msg);
    	  out.flush();
    	  
    	  System.out.println("Reading the Message from Server");
    	  String serv_msg = in.readLine();
    	  System.out.println("Server says :" + serv_msg);
    	  
    	  if (msg.trim().equals("bye") && serv_msg.trim().equals("bye")){
    		  break;
    	  }
        
      }

//      // receive data from the server
//      while (true) {
//        String str=in.readLine();
//        if (str==null) {
//          break;
//        } else {
//          System.out.println(str);
//        }
//      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}