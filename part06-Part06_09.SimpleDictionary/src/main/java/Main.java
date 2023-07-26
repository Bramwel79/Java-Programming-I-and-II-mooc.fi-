
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary book = new SimpleDictionary();
        book.add("one", "yksi");
        book.add("two", "kaksi");

        
        TextUI ui = new TextUI(scanner, book);
        ui.start();
    }   
}
