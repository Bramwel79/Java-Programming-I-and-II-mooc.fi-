
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts;

        while(input.length()!= 0){
            parts = input.split(" ");
            for(int i = 0; i < parts.length; ++i){
                if(parts[i].contains("av")){
                    System.out.println(parts[i]);  
                }
                
            }
            input = scanner.nextLine();
        }

    }
}
