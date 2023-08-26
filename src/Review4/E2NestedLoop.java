package Review4;

public class E2NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5 ; j++) {
                if (i==1&&j==2){
                    System.out.println(" ");
                }else
                System.out.print("#");

            }
            System.out.println();
        }
    }
}
