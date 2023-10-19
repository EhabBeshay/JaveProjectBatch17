package Review9;

public class PrinterTester {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print(5,"Ehab");
        p.print("ehab");
        p.print(10,20,30,40,50);
        System.out.println(Math.abs(-15+3));
    }
}
