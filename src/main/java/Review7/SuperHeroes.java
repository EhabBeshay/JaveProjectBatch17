package Review7;

public class SuperHeroes {
    String name, power;
    int age;
    char gender;

    SuperHeroes(String name, String power){
        this.name = name;
        this.power = name;
    }
    SuperHeroes(String name, String power, int age){
        this(name, power); // making a call to the current class constructor
        this.age = age; // this. accessing current class instance variables
    }

    public static void main(String[] args) {
        SuperHeroes hero1 = new SuperHeroes("Superman", "Fly");
        System.out.println(hero1.age);
        SuperHeroes hero2 = new SuperHeroes("Batman", "Money", 27);

    }

}
