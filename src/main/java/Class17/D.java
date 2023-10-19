package Class17;

public class D{

    String name;
    void printName(){
        System.out.println(name);
    }
}
class Y extends D {
    int number;

    void printNum(){
        System.out.println(number);
    }
}
class Z extends Y {
    String both;
    void nameNum (){
        System.out.println(name + " " + number );
    }
}
class T1{
    public static void main(String[] args) {
        Z z = new Z();
        z.nameNum();
    }
}
