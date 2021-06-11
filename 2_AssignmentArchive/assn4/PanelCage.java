import java.util.HashMap;
import java.util.Map;

public class PanelCage {
    private Map<Integer, SolarModule> cage = new HashMap<Integer, SolarModule>();

    SolarModule lookup(int panelKW){
        if(!cage.containsKey(panelKW)){
            cage.put(panelKW, new SolarModule(panelKW));
            System.out.printf("Making a New Solar Panel : %d KW Panel\n", panelKW);
        }
        return cage.get(panelKW);
    }

    // only for init constructe
    void constructOne(int panelKW){ 
        if(!cage.containsKey(panelKW)){
            cage.put(panelKW, new SolarModule(panelKW));
        }
    }
     
}
