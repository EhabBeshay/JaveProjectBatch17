package Class7;

public class HW7 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number.
        int[] numbers = {50,60,70,80,90,100};
        int largestNumber=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i] > largestNumber){
                largestNumber=numbers[i];
            }

        }
        System.out.println(largestNumber);
    }
}
