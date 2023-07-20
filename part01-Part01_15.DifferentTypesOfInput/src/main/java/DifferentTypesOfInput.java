
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        int input2;
        double input3; 
        Boolean input4;
        
        // Write your program here
        System.out.println("Give a string:");
        input = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        input2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        input3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        input4 = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + input);
        System.out.println("You gave the integer " + input2);
        System.out.println("You gave the double " + input3);
        System.out.println("You gave the boolean " + input4);
    }
}
