
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        int number;

        System.out.println("Give a number:");
        number = Integer.valueOf(scanner.nextLine());
        
        if(number == 0){
            factorial = 1;
        }

        if(number > 0){
            for(int i = 1; i <= number;++i){
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }
    }
}
