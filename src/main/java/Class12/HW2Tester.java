package Class12;

import java.util.Scanner;

public class HW2Tester {
    public static void main(String[] args) {
        HW2Student gra = new HW2Student();

        Scanner s= new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = s.nextInt();
        System.out.println("Your grade is: " +gra.getGrade(score));
    }
}
