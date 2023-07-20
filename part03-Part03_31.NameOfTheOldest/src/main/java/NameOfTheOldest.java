
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts;
        int age;
        String name;
        int oldest = 0;
        String oldestPerson = "";

        while(input.length()!= 0){
            parts = input.split(",");
            name = parts[0];
            age = Integer.valueOf(parts[1]);
            if(age > oldest){
                oldest = age;
                oldestPerson = name;
            }  
            input = scanner.nextLine();
        } 
                
        System.out.println("Name of the oldest: " + oldestPerson);

    }
}
