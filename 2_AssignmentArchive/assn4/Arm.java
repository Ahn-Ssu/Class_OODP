public class Arm extends RoverComponent implements Element, Cloneable{

    public Arm(String position) {
        super(position);
    }
    @Override
    protected Arm clone() throws CloneNotSupportedException {
        return (Arm)super.clone();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

