
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        
        System.out.println("Name: ");
        name = scanner.nextLine();

        while(!(name.isEmpty())){
           Item newItem = new Item(name);
           items.add(newItem);
           System.out.println("Name: ");
           name = scanner.nextLine();
        }

        for(Item it : items){
            System.out.println(it.toString());
        }
    }
}
