package class8;

import java.util.Scanner;

public class Repl {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}