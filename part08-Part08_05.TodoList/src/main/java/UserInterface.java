import  java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList chores, Scanner scan){
         list = chores;
         scanner = scan; 
    }
    
    public void start(){
        String command;
        int idx = -1;

        while(true){
           System.out.println("Command: ");
           command = scanner.nextLine();

           if(command.equals("stop")){
              break;
           }

           if(command.equals("add")){
               System.out.println("To add: ");
               list.add(scanner.nextLine());
           }

           if(command.equals("list")){
                list.print();
           }

           if(command.equals("remove")){
               System.out.println("Which one is removed? ");
               idx = Integer.valueOf(scanner.nextLine());
               list.remove(idx);
           }
        }
    }
}
