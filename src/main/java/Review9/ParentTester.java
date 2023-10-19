package Review9;

public class ParentTester {

    public static void main(String[] args) {
        Child c = new Child();
        /*When we create object of the Child class an object of all
        parents classes will be created automatically
         */
        c.test();
        c.methodTest();
    }
}
