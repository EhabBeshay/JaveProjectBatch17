package Class9;

public class HW3 {
    /* Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
    Develop a program which will identify/print the even numbers only.
     */
    public static void main(String[] args) {
      int [][] num = {
              {1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12}

      };

        for (int [] row : num){
            for (int col : row){
               if (col%2==0){
                   System.out.println(col);
               }
            }

        }


        }
        }




