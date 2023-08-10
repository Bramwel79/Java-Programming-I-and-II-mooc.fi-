
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println();
        input = scanner.nextLine();

        while(!(input.equals("end"))){
            System.out.println(Integer.valueOf(input)
            * Integer.valueOf(input) * Integer.valueOf(input));
            System.out.println();
            input = scanner.nextLine();
        }
        
    }
}
