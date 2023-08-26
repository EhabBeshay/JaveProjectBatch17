package class10;

public class Replit83 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, // sum = 4
                {3, 1, 2}, // sum = 6
                {3, 5, 3}, // sum = 11
                {0, 1, 2}  // sum = 3
        };

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    sum1 += a[i][j];
                } else if (i == 1) {
                    sum2 += a[i][j];
                } else if (i == 2) {
                    sum3 += a[i][j];
                } else if (i == 3) {
                    sum4 += a[i][j];
                }
            }
        }

        System.out.println(sum1); // Output: 4
        System.out.println(sum2); // Output: 6
        System.out.println(sum3); // Output: 11
        System.out.println(sum4); // Output: 3
    }

}