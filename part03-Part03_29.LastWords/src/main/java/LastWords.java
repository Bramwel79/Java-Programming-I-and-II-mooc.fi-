
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts;

        while(input.length()!= 0){
            parts = input.split(" ");
            System.out.println(parts[parts.length-1]);  
            input = scanner.nextLine();
        }   

    }
}
