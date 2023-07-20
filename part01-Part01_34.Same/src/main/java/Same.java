
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one;
        String two;
        // Write your program here.
        System.out.println("Enter the first string:"); 
        one = String.valueOf(scan.nextLine());
        System.out.println("Enter the second string:");
        two = String.valueOf(scan.nextLine());

        if(one.equals(two)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
