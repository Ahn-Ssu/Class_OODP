class PingPong2 extends Thread {
 String word;
 int delay;
 PingPong2(String whatToSay, int delayTime) {
   word = whatToSay; delay = delayTime;}
 public void run() {
  try {
    for (;;) {
      System.out.print(word + " ");
      sleep(delay);}
   } catch (InterruptedException e) {
      }}
 public static void main(String[] args) {
     new PingPong2("ping", 33).start();
     new PingPong2("PONG", 100).start();
         }
    }
