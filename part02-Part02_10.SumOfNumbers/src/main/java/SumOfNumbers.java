
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totals = 0;
        int no;

        while(true){
            System.out.println("Give a number:");
            no = Integer.valueOf(scanner.nextLine());

            if(no == 0){
                break;
            }else{
                totals += no;
            }
                        
        }
        System.out.println("Sum of the numbers: " + totals);
    }
}
