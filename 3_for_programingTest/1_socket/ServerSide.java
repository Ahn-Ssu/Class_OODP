
import java.io.*;
import java.net.*;
import java.util.Scanner; 

class ServerSide {

  public static void main(String[] args) {
    System.out.println("EchoServer started."); 
    try {
      ServerSocket s = new ServerSocket(8008); 
      Socket incoming = s.accept(); 

      System.out.println("Connected to: " + incoming.getInetAddress() +
			 " at port: " + incoming.getLocalPort()); 
      
      BufferedReader in 
	= new BufferedReader(new InputStreamReader(incoming.getInputStream())); 
      PrintWriter out 
	= new PrintWriter(new OutputStreamWriter(incoming.getOutputStream())); 

//      out.println("Hello! This is Java EchoServer. Enter BYE to exit."); 
//      out.flush();
      
//      for (;;) {
//	String str = in.readLine(); 
//	if (str == null) {
//	  break; 
//	} else {
//	  out.println("Echo: " + str); 
//	  out.flush();
//	  System.out.println("Received: " + str);
//	  
//	  if (str.trim().equals("BYE")) 
//	    break; 
//	}
//      }
      
      
      Scanner scanner = new Scanner(System.in);
      String msg = "";
      for (;;) {
    	  System.out.println("Reading the Message from Client.");
    	  String client_msg = in.readLine();
    	  System.out.println("client says :" + client_msg);
    	  
    	  
    	  System.out.println("Write a Message to client.");
    	  msg = scanner.nextLine();
    	  out.println(msg);
    	  out.flush();
    	  
    	  
    	  
    	  if (msg.trim().equals("bye") && client_msg.trim().equals("bye")) {
    		  break;
    	  }
        
      }
      
      
      incoming.close(); 
    } catch (Exception e) {
      System.out.println("Error: " + e); 
    }
    System.out.println("EchoServer stopped."); 
  }

}
