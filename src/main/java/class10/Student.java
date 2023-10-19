package class10;

public class Student {
    String name;
    String id;

    int age;

    void study(){
        System.out.println("Studying 16 hours a day.......");
    }
    public static void main(String[] args) {
        Student ehabObj = new Student();
        ehabObj.name = "Ehab";
        ehabObj.age = 23;
        ehabObj.id = "Abc123";
        ehabObj.study();

    }

}
