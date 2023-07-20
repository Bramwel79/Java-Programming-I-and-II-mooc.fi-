
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int no;

        while(true){
            System.out.println();
            no = Integer.valueOf(scanner.nextLine());

            if(no == 0){
                break;
            }
            if(no > 0){
                count += 1;
                sum += no;
            }
                        
        }
        if(sum == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(((1.0 * sum)/count));
        }
        

    }
}
