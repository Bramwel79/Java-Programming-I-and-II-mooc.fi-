
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;
        System.out.println();
        no = Integer.valueOf(scanner.nextLine());

        if(no < 0){
            System.out.println(no * -1);

        }else{
            System.out.println(no);
        }
        

        
    }
}
