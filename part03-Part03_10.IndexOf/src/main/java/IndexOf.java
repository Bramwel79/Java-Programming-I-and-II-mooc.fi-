
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;
        ArrayList<Integer> idx = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        no = Integer.valueOf(scanner.nextLine());

        // implement here finding the indices of a number
        for(int i = 0; i < list.size();++i){
            if(list.get(i) == no){
                idx.add(i);
            }
        }
        
        for(int y = 0; y < idx.size();++y){
            System.out.println(no + " is at index " + idx.get(y));
            
        }
            
        
        
    }
}
