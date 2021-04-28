public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("My name is " + p.getPrinterName() );
        p.print("Hello, world. Awakened");
        p.setPrinterName("Bob");
        System.out.println("My name is " + p.getPrinterName() );
        p.print("Hello, world.");
    }
}
