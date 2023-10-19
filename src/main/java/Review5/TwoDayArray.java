package Review5;

public class TwoDayArray {
    public static void main(String[] args) {
        int [][] array = new int[2][4];
        array[0][0] = 12;
        array[0][1] = 13;
        array[0][2] = 14;
        array[0][3] = 15;
        array[1][0] = 1;
        array[1][1] = 2;
        array[1][2] = 3;
        array[1][3] = 4;

        System.out.println(array[0+1][3]);

        for (int row = 0; row <array.length ; row++)
            for (int col = 0; col <array[row].length ; col++) {
                System.out.print(array[row][col] + " ");

            }

    }
}
