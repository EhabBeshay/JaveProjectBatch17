package Class19;

public class T2Static {

    public static void sta1(){
        System.out.println("Empty");
    }
    public static void sta1(String name){
        System.out.println("Static with "+name);
    }
    public static void sta1(int number){
        System.out.println("Static with "+number);
    }

}
class T2StaticTester{
    public static void main(String[] args) {
        T2Static.sta1();
        T2Static.sta1(1);
        T2Static.sta1("String");
    }
}
