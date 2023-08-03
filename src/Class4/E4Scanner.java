package Class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner s=new Scanner(System.in);
        String name= s.next();
        if (name.equals("Ehab")){
            System.out.println("King of Java");
        }else {
            System.out.println("Go away");
        }
        //System.out.println("Hello "+name);
    }
}
