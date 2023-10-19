package Class12;

import java.util.Scanner;

public class Calculator {
    void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of these numbers is " + sum);

    }

    void multiply (int number1, int number2){


        int result = number1*number2;
        System.out.println(result);
    }

    void largerNumber (int num1, int num2){

        if (num1 > num2){
            System.out.println("Larger number is: " +num1);
        }else {
            System.out.println("Larger number is: " +num2);
        }
    }


}
