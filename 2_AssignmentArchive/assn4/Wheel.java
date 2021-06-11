public class Wheel extends RoverComponent implements Element {

    public Wheel(String position) {
        super(position);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setPosition(String position){
        
    }
    
}
