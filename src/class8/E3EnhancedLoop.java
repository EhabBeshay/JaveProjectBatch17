package class8;

public class E3EnhancedLoop {
    public static void main(String[] args) {
      //  String[] names={"Tamim","Giulia","Ehab","Ayesha","Deepali"};

        int[] nums = {10,23,25,56,45,20};
        int counts = 0;
        for (int t : nums){
            if (t>20){
                counts++;
            }
        }
        System.out.println(counts);


    }
}
