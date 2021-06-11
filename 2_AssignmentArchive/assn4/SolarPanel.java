public class SolarPanel extends RoverComponent implements Element{
    SolarModule solarModule;
    public SolarPanel(String position, SolarModule panel) { 
        super(position);
        this.solarModule= panel;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);        
    }
}
