package Class12;

import java.util.Scanner;

public class HW1Tester {

    public static void main(String[] args) {
        HW1Methods isPrime = new HW1Methods();

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int num = s.nextInt();
        System.out.println(isPrime.PrimeNum(num));
    }
}
