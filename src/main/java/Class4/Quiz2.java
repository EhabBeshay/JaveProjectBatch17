package Class4;

public class Quiz2 {

    public static void main(String [] args) {
        boolean a, b, c;
        a = b = c = true;

        if( !a || ( b && c ) ) {
            System.out.println("If executed");
        } else {
            System.out.println("else executed");
        }

    }
}

