package Class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Chevrolet");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i)+" ");

        }
        for(String c : cars){
            System.out.print( c+" ");
        }
    }


}
