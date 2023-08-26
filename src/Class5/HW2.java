package Class5;

public class HW2 {
    public static void main(String[] args) {
        int quiz=92;
        int midTerm=89;
        int finalScores=91;
        int average=(quiz+midTerm+finalScores)/3;

        if (average>=90){
            System.out.println("Grade A");
        } else if (average>=70&&average<90) {
            System.out.println("Grade B");
        }else if (average>=50&&average<70){
            System.out.println("Grade C");
        } else if (average<50) {
            System.out.println("Grade F");
        } else if (average>100||average<1) {
            System.out.println("Invalid entry");
        }
    }
}
