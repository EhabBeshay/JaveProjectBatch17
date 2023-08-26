package Class7;

public class HW8 {
    public static void main(String[] args) {
        //Create an array to store char values and then print those in reverse order

        char[] grades = {'a','b','c','d'};
        for (int i = grades.length-1; i >=0 ; i--) {
            System.out.print(grades[i]+" ");

        }
    }
}
