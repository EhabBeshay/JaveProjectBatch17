package Class25;

import java.util.LinkedList;

/*Create a Cat class create 3 fields a constructor and and printInfo method inside it. Create three objects from this class store them
inside the Linkedlist and call printInfo method using these three objects.
 */
public  class Cat {

    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void printInfo(){
        System.out.println("The cat name is: "+name+" ,Age is: "+age+" and color is: "+color);

    }
}
class CatTester{
    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(new Cat("Kitty", 15, "Black"));
        cats.add(new Cat("Bisbis", 3, "Yellow"));
        cats.add(new Cat("Alpha", 5, "Blue"));

       cats.forEach(x->x.printInfo());

    }
}


