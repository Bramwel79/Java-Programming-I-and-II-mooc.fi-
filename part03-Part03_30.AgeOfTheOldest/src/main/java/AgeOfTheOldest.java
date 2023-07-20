
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts;
        int oldest = 0;
        ArrayList<Integer> ages = new ArrayList<Integer>();

        while(input.length()!= 0){
            parts = input.split(",");
            ages.add(Integer.valueOf(parts[1]));  
            input = scanner.nextLine();
        } 
        for(int age: ages){
            if(age > oldest){
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
