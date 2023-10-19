package Class19;

public class T1Tester {
    public static void main(String[] args) {
        T1 t1 = new T1();

       int min = t1.minimum(5,10);
        System.out.println("minimum number is: "+min);

        double min1 = t1.minimum(5.5,10.5);
        System.out.println("minimum number is: "+min1);
    }
}
