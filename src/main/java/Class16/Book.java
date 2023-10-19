package Class16;
/*
Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */
public class Book {
    private int noOfPages;
    private String bookName;
    private String author;

    public Book (int noOfPages, String bookName, String author){
        this(bookName, noOfPages);
        this.author = author;
    }
    public Book(String bookName, int noOfPages){
        this.noOfPages = noOfPages;
        this.bookName = bookName;
    }
    public void printInfo(){
        System.out.println("Book name: " + bookName);
        System.out.println("Number of pages: " + noOfPages);
        System.out.println("Author: "+ author);
    }
}
