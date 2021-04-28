import  java.io.*;

public class CopyTextFile {

  public static void main(String[] args) {
    if (args.length >= 2) {
      try {
	BufferedReader in = new BufferedReader(
				new FileReader(args[0]));

	PrintWriter out = new PrintWriter(
			      new BufferedWriter(
				  new FileWriter(args[1])));
	String  line;
	while ((line = in.readLine()) != null) {
	  out.println(line);
	}
	out.flush();
	out.close();
      } catch (IOException e) {}
    }
  }

}

