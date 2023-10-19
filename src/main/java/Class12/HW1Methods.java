package Class12;

public class HW1Methods {
    //Write a method to return whether given number is prime or not?

    String PrimeNum(int num) {
        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
//Sum is to check the sum of the strict divider for the given number

            }

        } if (sum == 1) {

            return "Is prime";
        } else {

            return "Not a prime";
        }


    }


}