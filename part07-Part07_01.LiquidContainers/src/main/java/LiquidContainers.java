
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = "First";
        String second = "Second";
        int capacityFirst = 0;
        int capacitySecond = 0;
        String command;
        int no;

        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();
            
            System.out.println(first + ":" + capacityFirst +  "/" + 100);
            System.out.println(second + ":" + capacitySecond +  "/" + 100);
            
            if (input.equals("quit")) {
                break;
            }else{
                String parts[] = input.split(" ");
                command = parts[0];
                no = Integer.valueOf(parts[1]);

                if(command.equals("add")){
                    if(no > 0){
                        int temp = no + capacityFirst;
                        if(!(temp > 100)){
                            capacityFirst = temp;
                        }else{
                            capacityFirst = 100;
                        }
                    }
                }
                
                if(command.equals("move")){
                    if(no > 0){
                        if(!(no > capacityFirst)){
                            capacitySecond += no;
                            capacityFirst -= no;
                            if(capacitySecond > 100){
                                capacitySecond = 100;
                            }
                            
                        }else{
                            if(capacityFirst > 0){
                                if(no > capacityFirst){
                                    capacitySecond = capacityFirst;
                                    capacityFirst = 0;
                                }
                            }
                        }
                    }
                }

                if(command.equals("remove")){
                    if(capacitySecond > 0){
                        if(capacitySecond > no){
                            capacitySecond -= no;
                        }else{
                            capacitySecond = 0;
                        }
                        
                    }
                }


            }

        }
    }

}
