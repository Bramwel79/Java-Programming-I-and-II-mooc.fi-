
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String grade0 = "impossible!";
        String grade01 = "failed";
        String grade1 = "1";
        String grade2 = "2";
        String grade3 = "3";
        String grade4 = "4";
        String grade5 = "5";
        String grade6 = "incredible!";
        int points;

        System.out.println("Give points [0-100]:");
        points = Integer.valueOf(scan.nextLine());
        
        if(points < 0){
            System.out.println(grade0);
        }else if(points >= 0 && points <=49){
            System.out.println("Grade:" + grade01);
        }else if(points >= 50 && points <= 59){
            System.out.println("Grade:" + grade1);
        }else if(points >= 60 && points <= 69){
            System.out.println("Grade:" + grade2);
        }else if(points >= 70 && points <= 79){
            System.out.println("Grade:" + grade3);
        }else if(points >= 80 && points <= 89){
            System.out.println("Grade:" + grade4);
        }else if(points >= 90 && points <= 100){
            System.out.println("Grade:" + grade5);
        }else{
            System.out.println("Grade:" + grade6);
        }

    }
}
