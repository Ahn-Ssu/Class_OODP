
public class Producer extends Thread {

	  private Mediator med;
	  private int    id;
	  private static int num = 1;
	  public Producer( Mediator m ) {
	    med = m;
	    id = num++;
	  }
	  public void run() {
	    int num;
	    for (int i =0; i<=20; i++) {
	      med.storeMessage( num = (int)(Math.random()*100) );
	      System.out.print( "p" + id + "-" + num + "  " );
	    }
	  }
	}

