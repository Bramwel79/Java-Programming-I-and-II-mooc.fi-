
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yr;

        System.out.println("Give a year:");
        yr = Integer.valueOf(scan.nextLine());

        if(yr % 100 == 0){
            if(yr % 400 == 0){
                System.out.println("The year is a leap year.");
            }else{
                System.out.println("The year is not a leap year.");
            }
        }else if(yr % 4 == 0){
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
    }
}
