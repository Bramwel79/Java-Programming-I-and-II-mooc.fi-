
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Caput Draconis";
        String input;

        // Write your program here 
        System.out.println("Password?");
        input = scan.nextLine();
        if(input.equals(password)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }

    }
}
