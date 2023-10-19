package Class18;

class Grandpa{
    String color = "White";
}
public class Furniture {
    String color = "Black";

}

class Chair extends Furniture{
    String color = "Brown";
    void printInfo(){
        System.out.println(super.color);
    }
}

class FurnitureTester{
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printInfo();
    }
}