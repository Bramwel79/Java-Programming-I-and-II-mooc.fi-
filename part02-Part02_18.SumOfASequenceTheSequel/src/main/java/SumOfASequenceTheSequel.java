
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int sum = 0;

        System.out.println("First number?");
        firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        secondNumber = Integer.valueOf(scanner.nextLine());

        if(secondNumber> firstNumber){
            for(int i = firstNumber; i <= secondNumber;++i){
                sum += i;
            }
        }
        System.out.println("The sum is:"+ sum);
    }
}
