public class Book{
    private String title;
    private int pageNumbers;
    private int publicationYear;

    public Book(String bookTitle, int pagenos, int pyear){
        title = bookTitle;
        pageNumbers = pagenos;
        publicationYear = pyear;
    }
    
    public String getTitle(){
        return title;
    }

    public String toString(){
        return(title + ", " + pageNumbers + " pages, " + publicationYear);
    }
}