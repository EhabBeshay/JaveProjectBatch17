package Class6;

import java.util.Scanner;

public class E4IncrementOperators {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Please enter starting point");
        int start=s.nextInt();
        System.out.println("Please enter the ending point");
        int end=s.nextInt();
        System.out.println("Please enter the steps as well");
        int step=s.nextInt();
        while (start<=end){
            System.out.print(start+" ");
            start += step;
        }

    }
}
