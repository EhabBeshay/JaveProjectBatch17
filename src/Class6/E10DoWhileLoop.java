package Class6;

import java.util.Scanner;

public class E10DoWhileLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input;



        do{
            System.out.println("Please enter your name or Shutdown to close the program");
            input=s.nextLine();
            System.out.println("You are great "+input);

        }while (!input.equalsIgnoreCase("Shutdown"));
    }
}
