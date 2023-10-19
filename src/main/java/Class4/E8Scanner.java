package Class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name=s.next();
        if (name.equals("Jamel")){
            System.out.println("Senior SDET in 2 years");
        } else if (name.equals("Ayesha")){
            System.out.println("I live in canda");

        } else if (name.equals("Ehab")) {
            System.out.println("Congratulations");
        }
    }
}
