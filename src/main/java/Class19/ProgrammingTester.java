package Class19;
class Programming {
    private String language;

    Programming(){
        System.out.println("I love Programming languages");
    }

    Programming(String language){
        this.language=language;

        System.out.println("I love  "+language);
    }
}
class ProgrammingTester {
    public static void main(String[] args) {
        new Programming();
        new Programming("Java");
    }


}
