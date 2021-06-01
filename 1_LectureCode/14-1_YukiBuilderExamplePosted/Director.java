public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("Morning and Evening");
        builder.makeItems(new String[]{
            "Good Morning",
            "How are you",
        });
        builder.makeString("At Night");
        builder.makeItems(new String[]{
            "How are you",
            "Good Night",
            "Bye",
        });
        builder.close();
    }
}
