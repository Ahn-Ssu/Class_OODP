import java.util.List;
import java.util.ArrayList;
import java.util.Iterator; 

public class Blackbox {

    private static Blackbox instance = new Blackbox();
    private Blackbox(){}
    public static Blackbox getInstance() {
        return instance;
    }

    private List<String> memory = new ArrayList<String>();

    public void record(String eventDetail){
        memory.add(eventDetail);
    }

    public void showAllRecord(){
        System.out.println(" +++ Major Checking and Action from "+Utils.makeBoldString("Blackbox")+" +++");

        Iterator<String> iterator = memory.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();
            if( memory.size() > 9) System.out.printf("%2d : %s\n", memory.indexOf(next)+1, next);
            else System.out.printf("%d : %s\n", memory.indexOf(next)+1, next);
        }

        System.out.println(" +++ Blackbox Displayed Finished +++");
        
        memory.clear();
    }
    
}
