
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int ans;
        int cube;

        while(true){
            input = scanner.nextLine();    
            if(input.equals("end")){
                break;
            }
            ans = Integer.valueOf(input);
            System.out.println(ans * ans * ans);
            
        }

        
    }
}
