package Class9;

public class E32DArrays {
    public static void main(String[] args) {
        int [][] numbers = {
                {10,20,30,40},
                {100,200,300},
                {100,200,300,400}
        };
        int [] row = numbers[0];
        int number = numbers[1][2];
        System.out.println(numbers[1][2]);
    }
}
