package Class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your Gender F/M");

        char gender=s.next().charAt(0);
        System.out.println("Your Gender is "+gender);
    }
}
