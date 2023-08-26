package class8;

public class T8EnhancedLoop {
    public static void main(String[] args) {
        int[] nums = {10,23,25,56,45,20};
        for (int n : nums)
            if (n==45){
                System.out.println("Found");
                break;
            }
    }
}
