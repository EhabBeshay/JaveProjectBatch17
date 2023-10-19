package Class17;

public class Teacher {
    String name;
    String subject;
    String degree;

    public void beh1(){
        System.out.println("Uses WhiteBoard");
    }
    public void beh2(){
        System.out.println("Uses ChalkBoard");
    }

    public void beh3(){
        System.out.println("Uses Zoom");
    }

    public void beh4(){
        System.out.println("Uses Nothing");
    }
}

class MathTeacher extends Teacher{
    void math(){
        int sum = 2 + 2;
        System.out.println(sum);
    }
}
class ChemistryTeacher extends Teacher{
    void chem(){
        System.out.println("Periodic table");
    }
}
class PianoTeacher extends Teacher{
    void piano(){
        System.out.println("Keys");
    }


    }
    class TeacherTester{
        public static void main(String[] args) {
            MathTeacher teach1 = new MathTeacher();
            teach1.name= "Berta";
            teach1.degree="Masters";
            teach1.subject= "Math";
            teach1.math();
        }
    }

