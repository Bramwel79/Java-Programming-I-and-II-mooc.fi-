
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts;
        int birthDate;
        double avg;
        int sum = 0;
        String name;
        int longestNameSize = 0;
        int count = 0;
        String longestName = "";

        while(input.length()!= 0){
            parts = input.split(",");
            name = parts[0];
            birthDate = Integer.valueOf(parts[1]);
            if(name.length() > longestNameSize){
                longestNameSize = name.length();
                longestName = name;
            } 
            count += 1;
            sum += birthDate;
            input = scanner.nextLine();
        } 
        avg = (1.0 * sum) / count;        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);


    }
}
