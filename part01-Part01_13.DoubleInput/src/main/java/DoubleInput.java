
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double input; 
        // write your program here
        System.out.println("Give a number:");
        input = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + input);

    }
}
