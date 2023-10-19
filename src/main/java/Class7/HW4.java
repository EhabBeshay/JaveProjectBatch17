package Class7;

public class HW4 {
    public static void main(String[] args) {
        /*Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */
        String[] cars = {"Honda", "Toyota", "Tesla", "GMC", "Ford", "Hyundai"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        //With While loop
        System.out.println();

        int j = 0;
        while (j < cars.length) {
            System.out.print(cars[j] + " ");
            j++;
        }
    }
}


