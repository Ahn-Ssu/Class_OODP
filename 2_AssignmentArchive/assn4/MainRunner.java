public class MainRunner {

    public static void main(String[] args){
        MainRunner myRunner = new MainRunner();
        myRunner.run();
    }

    private void run() {
        RoverBooter myBooter = RoverBooter.getInstance();
        myBooter.startRover();
    }
    
}
