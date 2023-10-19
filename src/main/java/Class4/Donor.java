package Class4;

public class Donor {
    public static void main(String[] args) {
        int age=21;
        int weight=120;
        if (age>18){
            System.out.println("You can donate");
            if (weight>110){
                System.out.println("You are eligible to donate");
            }

        }else {
            System.out.println("You are not eligible to donate");
        }
    }
}
