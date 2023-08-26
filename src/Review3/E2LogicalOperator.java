package Review3;

public class E2LogicalOperator {
    public static void main(String[] args) {
        boolean isMeat=true;
        boolean isEgg=true;
        boolean isFish=true;
        boolean isProtein=isFish|isEgg||isMeat;
        System.out.println(isProtein);


    }
}
