package Class7;

public class HW2 {
    public static void main(String[] args) {
        /*Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
         */

        String[] names = {"Ayesha","Abi","Ehab","Giulia","Arthur","Jamel","Deepali","Madina","Tahmin"};
        System.out.println(names[2]);

        //second way

        String[] names1 = new String[9];
        names1[0] = "Ayesha";
        names1[1] = "Abi";
        names1[2] = "Ehab";
        names1[3] = "Arthur";
        names1[4] = "Jamel";
        names1[5] = "Deepali";
        names1[6] = "Madina";
        names1[7] = "Tahmin";
        names1[8] = "Giulia";
        System.out.println(names1[2]);

    }
}
