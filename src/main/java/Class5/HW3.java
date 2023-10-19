package Class5;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your grade (A,B,C or D)");
        char grade=s.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println(grade+" -Excellent");
                break;
            case 'B':
                System.out.println(grade+" -Good");
                break;
            case 'C':
                System.out.println(grade+" -Average");
                break;
            case 'D':
                System.out.println(grade+" -Bad");
                break;
            default:
                System.out.println("Not acceptable");

        }

    }
}
