import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager joker;

    public UserInterface(JokeManager manager, Scanner scan){
        scanner = scan;
        joker = manager;
    }

    public void start(){
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                joker.addJoke(joke);
            } 

            if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                joker.drawJoke();
            } 

            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                joker.printJokes();  
            }
            
        }
    }
}
