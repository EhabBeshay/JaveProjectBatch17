package Review9;

public class Parent {
     String name = "James";

    void printHello(){
        System.out.println("Hello parent");
    }
    Parent(){
        System.out.println("Parent class Constructor");
    }
    Parent(String n){
        System.out.println("Parent class Constructor with parameter");}
}

class Child extends Parent{
    String name = "John";
    void printHello(){
        System.out.println("Hello child");
    }
    void test(){
        System.out.println(super.name);
        System.out.println(this.name);
        // calling instance variable of the parent calss
    }
    void methodTest(){
        super.printHello();
        this.printHello();
    }
    public Child(){



    }
}
