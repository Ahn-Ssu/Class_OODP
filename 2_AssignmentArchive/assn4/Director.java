public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
        builder.makeTitle("Rover Running");
    }

    public void makeCustomString(String contents){
        builder.makeString(contents);
    }

    public void makeCustomItems(String[] contents){
        builder.makeItems(contents);
    }

    public void callClose(){
        builder.close();
    }
}
