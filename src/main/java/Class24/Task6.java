package Class24;

import java.util.ArrayList;
//Create an arrayList of even numbers from 1 to 500.
// Remove any number that is divisible by 5 from that arrayList.
public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 2; i <= 500; i+=2) {
            number.add(i);
        }System.out.println(number);

        number.removeIf(x->x %5==0);
        System.out.println(number);


        }


    }

