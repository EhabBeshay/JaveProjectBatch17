package class8;

public class E2Arrays {
    public static void main(String[] args) {
        boolean [] conds = {true,false,true,false,true,true};
        int count=0;


        for (int i = 0; i < conds.length ; i++) {

            if (conds[i]){
                count++;
            }


        }
        System.out.println(count);

    }
}
