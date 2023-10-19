package Class3;

public class ExpectedTempretures {
    public static void main(String[] args) {

        double expectedTemperature = 20.5;
        double actualTemperature = 25.4;

        if (expectedTemperature>actualTemperature){
            System.out.println("It's cooler than expected, wear a jacket!");
        }else {
            System.out.println("It's as warm as expected, enjoy your day!"
            );
        }
    }
}
