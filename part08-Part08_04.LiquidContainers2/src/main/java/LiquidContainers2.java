
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacityFirst = 0;
        int capacitySecond = 0;
        String command;
        int no;
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();
            
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());
            
            if (input.equals("quit")) {
                break;
            }else{
                String parts[] = input.split(" ");
                command = parts[0];
                no = Integer.valueOf(parts[1]);

                if(command.equals("add")){
                    container1.add(no);
                }
                
                if(command.equals("move")){
                    capacityFirst = container1.contains();
                    if(no < capacityFirst){
                        container1.remove(no);
                        container2.add(no);
                    }else{
                        container1.setCapacity(0);
                        container2.add(capacityFirst);
                    }
                                        
                }

                if(command.equals("remove")){
                    container2.remove(no);
                }


            }

        }
    }

}
