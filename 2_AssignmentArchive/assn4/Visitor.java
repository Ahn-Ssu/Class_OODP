public interface Visitor {
    public void visit(Wheel wheel);
    public void visit(Motor motor);
    public void visit(Arm arm);
    public void visit(Camera cam);
    public void visit(SolarPanel solarPanel);
}
