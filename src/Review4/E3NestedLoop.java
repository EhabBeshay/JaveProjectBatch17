package Review4;

public class E3NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 0; i <= 3 ; i++) {
            for (int j = 0; j <4-i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }}