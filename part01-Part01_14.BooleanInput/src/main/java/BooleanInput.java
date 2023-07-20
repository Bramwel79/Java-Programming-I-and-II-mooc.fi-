
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean input;

        // write your program here
        System.out.println("Write something:");
        input = Boolean.valueOf(scanner.nextLine());
        System.out.print("True or false? ");
        System.out.println(input);

    }
}
