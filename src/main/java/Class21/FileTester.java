package Class21;

public class FileTester {
    public static void main(String[] args) {
        T1File[] arr = {new WordFile("Word", 1.2), new JavaFile("Java", 2.2),
                new PdfFile("PDF", 30.2)};
        for(T1File f : arr){
            f.open();
            f.edit();
            f.close();

        }
    }
}
