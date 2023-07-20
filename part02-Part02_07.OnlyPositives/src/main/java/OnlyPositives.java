
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;

        while(true){
            System.out.println("Give a number:");
            no = Integer.valueOf(scanner.nextLine());

            if(no < 0){
                System.out.println("Unsuitable number");
                continue;
            }else if(no == 0){
                break;
            }else{
                System.out.println(no * no);
            }
        }
        

    }
}
