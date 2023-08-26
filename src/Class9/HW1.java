package Class9;

public class HW1 {
    /* Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops

     */
    public static void main(String[] args) {
      String [][] grocery = {
              {"Cucumber", "Potatoes", "Lettuce", "Carrots"},
              {"Watermelon", "Banana", "Kiwi", "Peach"},
              {"Milk", "Cheese", "Yogurt", "Cream"},
              {"Candy", "Chocolate", "Kinder", "Cake"},


      };
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j <grocery[i].length ; j++) {
                System.out.print(grocery[i][j]+" ");

            }
            System.out.println();

            }
        System.out.println("=========================");
        for (String[] row : grocery){
            for (String col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        }
        }




