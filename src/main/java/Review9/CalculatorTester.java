package Review9;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);

        System.out.println(c.add(5,10,15));
        int result = c.add(1,2,3);
        //int result1 = c.add(5,10);  void method can't return data.
        System.out.println(c.add(55,554,5742,554555,4455));
    }

}
