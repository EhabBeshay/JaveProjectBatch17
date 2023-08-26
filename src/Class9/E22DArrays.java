package Class9;

public class E22DArrays {
    public static void main(String[] args) {
        String [][] names =
                {           {"Hind", "Mikhail", "Ismael", "Ahmed"},
                            {"John", "Bob", "Adam", "Tamim"},
                            {"Joke", "John", "Ahmed", "Ashraf"},
                            {"Gui", "Backend", "Front", "Api"}

                };
        String[] firstRow= names[1];
        //System.out.println(Arrays.toString(firstRow));
        for(String name : firstRow){
            System.out.println(name);
        }

    }
}
