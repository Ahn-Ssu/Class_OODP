public class Mediator {

	  private boolean slotFull = false;
	  private int number;
	  public synchronized void storeMessage( int num ) {

	    while (slotFull == true) {
	      try {
	        wait();
	      }
	      catch (InterruptedException e ) { }
	    }
	    slotFull = true;
	    number = num;
	    notifyAll();
	  }
	  public synchronized int retrieveMessage() {

	    while (slotFull == false)
	      try {
	        wait();
	      }
	      catch (InterruptedException e ) { }
	    slotFull = false;
	    notifyAll();
	    return number;
	  }
	}

