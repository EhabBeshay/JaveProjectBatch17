package Class7;

public class HW5 {
    public static void main(String[] args) {
        /*
        Create an array of animals and store 5 elements into it.
        Using 2 different loops print all elements from the array.
         */
        String[] animals = {"Lion","Donkey","Monkey","Elephant","Cow"};

        for (int i = 0; i <animals.length ; i++) {
            System.out.print(animals[i] + " ");
        }
            //With while loop
            System.out.println();
            int j=0;
            while (j<animals.length){
                System.out.print(animals[j]+" ");
                j++;
            }

    }
}
