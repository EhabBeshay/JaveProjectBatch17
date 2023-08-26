package Class9;

public class T12DArrays {
    public static void main(String[] args) {
        int [][] numbers = {
                {10,20,30,40},
                {100,200,300,400},
                {100,200,300,400}
        };
        for (int row = 0; row < numbers.length ; row++) {
                for (int col = 0; col < numbers[row].length ; col++) {  //numbers[row] = give us the complete 1D array
                    if (numbers[row][col]%2==0) {
                        System.out.print(numbers[row][col] + " ");
                    }
            }
            System.out.println();

        }
    }
}
