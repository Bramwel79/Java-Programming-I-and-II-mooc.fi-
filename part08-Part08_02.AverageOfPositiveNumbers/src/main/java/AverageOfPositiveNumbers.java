
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int no;
        int count = 0;
        int total = 0;
        double avg = 0.0;
        
        System.out.println();
        input = scanner.nextLine();

        while(!(input.equals("0"))){
            no = Integer.valueOf(input);
            if(no > 0){
                count += 1;
                total += no;

            }
            System.out.println();
            input = scanner.nextLine();
        }

        if(count > 0){
            avg = (1.0 * total) / count;
            System.out.println(avg);
        }else{
            System.out.println("Cannot calculate the average");
        }
                

    }
}
