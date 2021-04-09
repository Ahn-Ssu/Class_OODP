
import java.io.*;
import java.net.*;
import java.util.Scanner;

class ServerSide2 {

	public static void main(String[] args) {
		System.out.println("EchoServer started.");
		try {
			ServerSocket s1 = new ServerSocket(8008);
			ServerSocket s2 = new ServerSocket(8009);
			Socket incoming1 = s1.accept();
			Socket incoming2 = s2.accept();

			System.out.println("Connected to: " + incoming1.getInetAddress() + " at port: " + incoming1.getLocalPort());
			System.out.println("Connected to: " + incoming2.getInetAddress() + " at port: " + incoming2.getLocalPort());

			BufferedReader in1 = new BufferedReader(new InputStreamReader(incoming1.getInputStream()));
			PrintWriter out1 = new PrintWriter(new OutputStreamWriter(incoming1.getOutputStream()));

			BufferedReader in2 = new BufferedReader(new InputStreamReader(incoming2.getInputStream()));
			PrintWriter out2 = new PrintWriter(new OutputStreamWriter(incoming2.getOutputStream()));


			Scanner scanner = new Scanner(System.in);
			String msg1 = "";
			String msg2 = "";
			for (;;) {
				System.out.println("Reading the Message from Client 1");
				String client1_msg = in1.readLine();
				System.out.println("client says :" + client1_msg);

				System.out.println("Write a Message to client 1.");
				msg1 = scanner.nextLine();
				out1.println(msg1);
				out1.flush();
				
				System.out.println("Reading the Message from Client 2");
				String client2_msg = in2.readLine();
				System.out.println("client says :" + client2_msg);

				System.out.println("Write a Message to client 2.");
				msg2 = scanner.nextLine();
				out2.println(msg2);
				out2.flush();

				if (msg1.trim().equals("bye")
						&& msg2.trim().equals("bye")
						&& client1_msg.trim().equals("bye")
						&& client2_msg.trim().equals("bye")) {
					break;
				}

			}

			incoming1.close();
			incoming2.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		System.out.println("Server stopped.");
	}

}
