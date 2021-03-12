class PingPong extends Thread {
 String word;
 int delay;
 PingPong(String whatToSay, int delayTime) {
   word = whatToSay; delay = delayTime;}
 public void run() {
  try {
    for (;;) {
      System.out.print(word + " ");
      sleep(delay);}
   } catch (InterruptedException e) {
      return;}}
 public static void main(String[] args) {
     new PingPong("ping", 33).start();
     new PingPong("PONG", 100).start();
         }
    }
