
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int no;

        while(true){
            System.out.println("Give a number:");
            no = Integer.valueOf(scanner.nextLine());

            if(no == 0){
                break;
            }else{
                count += 1;
                sum += no;
            }
                        
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
