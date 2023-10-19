package Class4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please write your age");
        int age=s.nextInt();

        if (age>18){
            System.out.println("Congratulations, you're eligible to have a driving license");
        }else {
            System.out.println("You may apply for a learner permit");
        }
    }
}
