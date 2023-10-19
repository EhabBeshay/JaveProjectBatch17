package Class16;

public class Test {
    private String name;
    private int age;
    private double weight;
    private String hairColor;

    protected Test(String name, int age, double weight, String hairColor) {
        this(name, age, weight);
        this.hairColor = hairColor;

    }

    public Test(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = age;
    }

     Test(String name, int age) {
        this.name = name;
        this.age = age;

    }

    private Test(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+weight+" "
                +hairColor);

}}