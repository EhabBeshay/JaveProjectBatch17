package Class26;

import java.util.TreeMap;

/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc.
 */
public class HW2 {
    public static void main(String[] args) {
        TreeMap<Integer,Person> personID = new TreeMap<>();
        personID.put(1, new Person("Adam", "Smith", 35, 200000));
        personID.put(2, new Person("David", "Brian", 40, 150000));
        personID.put(3, new Person("Ehab", "Beshay", 33, 100000));
        personID.put(4, new Person("Mohamed", "Hassan", 24, 80000));
        personID.forEach((k,v)-> {
            System.out.println("ID "+k);
            v.displayInfo();
        });
    }
}
class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;
    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void displayInfo(){
        System.out.println("Name is: "+name+" "+lastName+" age is: "+age+" salary is: "+salary);
    }
}
