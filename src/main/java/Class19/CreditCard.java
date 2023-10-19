package Class19;

public class CreditCard {


    public void calculateInterest(double balance) {
        System.out.println(balance* 0.05);


    }
}

class AX extends CreditCard {
    public void calculateInterest(double balance) {
        System.out.println(balance* 0.07);

    }
}

class Visa extends CreditCard {

}

class CreditCardTester {
    public static void main(String[] args) {
        new CreditCard().calculateInterest(125);


        new AX().calculateInterest(125);
        new Visa().calculateInterest(125);
    }
}