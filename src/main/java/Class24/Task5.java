package Class24;

import java.util.ArrayList;
/*Create an arrayList of even numbers from 1 to 500 using a loop.
Then write another loop to  Remove any number that is divisible by 5 from that arrayList.
 */

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 2; i < 500; i+=2) {
            if(i%5==0){
                continue;
            }else {
                number.add(i);
            }


        }System.out.println(number);


    }
    
}
