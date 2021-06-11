public class Motor extends RoverComponent implements Element{

    public Motor(String position) {
        super(position);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
