package class8;

public class E4EnhancedLoop {
    public static void main(String[] args) {
      //  String[] names={"Tamim","Giulia","Ehab","Ayesha","Deepali"};

        int[] nums = {10,23,25,56,45,20};

        int largest= nums[0];
        for (int n:nums){
            if (n>largest){
                largest = n;
            }
        }
        System.out.println(largest);

    }
}
