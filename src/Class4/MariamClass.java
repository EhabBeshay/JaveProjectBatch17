package Class4;

import java.util.Scanner;

public class MariamClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("What is your age");
        int age=s.nextInt();

        if(age>18){
            System.out.println("You are eligible for a driving licence");
        }else if (age==18){
            System.out.println("You may get a learner permit");
        } else if (age<18) {
            System.out.println("You rae not eligible for a licence");
        }
    }
}
