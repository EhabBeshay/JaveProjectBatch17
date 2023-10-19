package Class21;

public abstract class T1File {

    private String name;
    private double size;


    public T1File(String name, double size) {
        this.name = name;
        this.size = size;
    }
    public abstract void open();


    public void edit(){
        System.out.println("Edit file "+ name);

    }
   public void close(){
        System.out.println("Close file "+name);

    }
}
class JavaFile extends T1File{

    public JavaFile (String name, double size) {
        super(name, size);

    }

    public void open(){
        System.out.println("To open Java file you need notepad");
    }
}
class WordFile extends T1File{

    public WordFile(String name, double size) {
        super(name, size);
    }

   public void open(){
        System.out.println("To open word file you need microsoft word");
    }
}
class PdfFile extends  T1File{

    public PdfFile(String name, double size) {
        super(name, size);
    }

    public void open(){
        System.out.println("Install PDf");
    }
}