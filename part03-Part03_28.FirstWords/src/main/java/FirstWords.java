
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts;

        while(input.length()!= 0){
            parts = input.split(" ");
            System.out.println(parts[0]);  
            input = scanner.nextLine();
        }

    }
}
