package Class5;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double num1=s.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2=s.nextDouble();
        System.out.println("Please enter the operator");
        char operator=s.next().charAt(0);
        double result=0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! can't divide by Zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println("Result: "+result);



    }
}
