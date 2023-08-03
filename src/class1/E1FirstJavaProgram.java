package class1;

import java.util.Scanner;

public class E1FirstJavaProgram {

    public static void main(String[] args) {


            Scanner s=new Scanner(System.in);
            System.out.println("Is it sunny outside?");
            boolean sunny=s.nextBoolean();



            if(sunny==true){
                System.out.println("It is a sunny day, I should go somewhere!");
                System.out.println("What is the temperature outside?");
                int temp=s.nextInt();
                if(temp>85){
                    System.out.println("I am going to the beach");
                }else{
                    System.out.println("I am going to the park");
                }
            }else{
                System.out.println("I stay home and practice Jave");
            }
    }

}
