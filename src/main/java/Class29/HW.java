package Class29;

import java.util.InputMismatchException;
import java.util.Scanner;

//How would handle InputMismatchException? Input Mismatch Exception
// when user enters mismatch value then programmer expected.
public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter true or false");
        try {
            boolean bol = scanner.nextBoolean();
            System.out.println("The entered boolean is: " + bol);
        } catch (InputMismatchException e){
            System.out.println("The entered data wasn't a boolean");
            System.out.println("your exception is "+e);
        }
    }
}