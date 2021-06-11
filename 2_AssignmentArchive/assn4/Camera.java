
class Camera extends RoverComponent implements Element{

    public Camera(String position) {
        super(position);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}