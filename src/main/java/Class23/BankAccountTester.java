package Class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Marta",12525555,2252415,"user123",
                "pass123","Checking");

        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Shawn");
        System.out.println(b.getName());


    }
}
