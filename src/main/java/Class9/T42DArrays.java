package Class9;

public class T42DArrays {
    public static void main(String[] args) {
      String [][] cars = {
              {"Ford", "Tesla", "Jeep", "Ram"},
              {"Audi", "BMW", "Mercedes", "Porsche"},
              {"Hyundai", "Kia", "Genesis", "SsangYong"},
              {"Mazzanti", "Ferrari", "Lamborghini", "Maserati"},


      };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");

            }
            System.out.println();



            }
        System.out.println("=========================");
        for (String[] row : cars){
            for (String col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        }
        }




