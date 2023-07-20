import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String title;
        int pages;
        int publishYear;
        String ans;
        
        while(true){
            System.out.println("Title: ");
            title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }else{
                System.out.println("Pages: ");
                pages = Integer.valueOf(scanner.nextLine());
                System.out.println("Publication year: ");
                publishYear = Integer.valueOf(scanner.nextLine());
                Book newBook = new Book(title,pages,publishYear);
                books.add(newBook);
            }
        }
        
        System.out.println("What information will be printed? ");
        ans = scanner.nextLine();

        if(ans.equals("everything")){
            for(Book book: books){
                System.out.println(book.toString());
            }
        }
        if(ans.equals("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }
        

    }
}
