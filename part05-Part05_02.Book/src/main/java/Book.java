public class Book {
    private String bookAuthor;
    private String bookTitle;
    private int bookPageCount;

    public Book(String author, String name, int pages){
        bookAuthor = author;
        bookTitle = name;
        bookPageCount = pages;
    }

    public String getAuthor(){
        return bookAuthor;
    }

    public String getName(){
        return bookTitle;
    }

    public int getPages(){
        return bookPageCount;
    }

    public String toString(){
        return bookAuthor + ", " + bookTitle + ", " + bookPageCount + " pages"; 
    }
    
}
