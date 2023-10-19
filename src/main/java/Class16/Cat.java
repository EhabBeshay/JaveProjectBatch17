package Class16;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private String hairColor;
    private double hoursOfSleep;
    private String ownerName;

    public Cat(String name, int age, double weight, String hairColor,
               double hoursOfSleep,String ownerName){
        this(name, age, weight, hairColor);
        this.hoursOfSleep = hoursOfSleep;
        this.ownerName = ownerName;

    }
    public Cat(String name, int age, double weight, String hairColor){
        this(name, age, weight);
        this.hairColor = hairColor;

    }
    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;


    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+weight+" "
                +hairColor+" "+hoursOfSleep+" "+ownerName);
    }
}
