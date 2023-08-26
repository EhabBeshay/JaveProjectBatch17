package Review5;

public class ArrayReview {
    public static void main(String[] args) {
        int a =10;
        int[] array = {10,11,12,13,55,34,24};

        int numberOfElements = array.length;
        System.out.println(numberOfElements);
        System.out.println(array[3]);

        //for (int i = 0; i < array.length; i++) {
          //  System.out.print(array[i] + " ");


        for (int ar:array) {
                System.out.println(ar);

            }

        }
    }

