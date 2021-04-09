public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("Printer instance being generated");
    }
    public Printer(String name) {
        this.name = name;
        heavyJob("Printer instance  (" + name + ") being generated");
    }
    public void setPrinterName(String name) {
        this.name = name;
    }
    public String getPrinterName() {
        return name;
    }
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("Complete");
    }
}
