package Class13;

public class E1LocalVariables {
    public static void main(String[] args) {
        String country = "USA";  //inside class but not inside block of code = instance variable


            String name = "java";

            if (10 > 5) {
                int age = 25;
                System.out.println(name);
                System.out.println(age);
            }
            //System.out.println(age); //cannot access the local variable outside it's block of code {} = local variable
            System.out.println(name);
        }
    }
