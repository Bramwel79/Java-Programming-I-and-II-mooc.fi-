
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> smallidx = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        smallest = list.get(0);
        for(int i = 1; i < list.size();++i){
            if(list.get(i) <= smallest){
                    smallest = list.get(i);
                    smallidx.add(i);
                }
            
        }
                
        System.out.print("Smallest number: " + smallest);
        
        for(int x = 0; x < smallidx.size();++x){
            System.out.println("Found at index: " + smallidx.get(x));    
        }
            

        
    }
}
