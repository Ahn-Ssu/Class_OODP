public class RoverComponent {
    public String position;
    public boolean eventFlag;

    public RoverComponent(String position){
        this.position = position;
        this.eventFlag = Utils.makeEventorNot();
    }
}
