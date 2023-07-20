
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totals = 0;
        int no;

        while(true){
            System.out.println("Give a number:");
            no = Integer.valueOf(scanner.nextLine());

            if(no == 0){
                break;
            }
            
            if(no < 0){
                totals += 1;
            }
        }
        System.out.println("Number of negative numbers: " + totals);
    }
}
