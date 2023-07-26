import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scan, SimpleDictionary dict){
        scanner = scan;
        simpleDict = dict;
    }

    public void start(){
        String input;
        String word;
        String translation;
        String search;
        String translated = null;
        
        outer:        
        while(true){
            System.out.println("Command:");
            input = scanner.nextLine();
            
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break outer;
            }
            
            if(input.equals("add")){
                System.out.println("Word:");
                word = scanner.nextLine();
                System.out.println("Translation:");
                translation = scanner.nextLine();
                simpleDict.add(word, translation);
            }else if(input.equals("search")){
                System.out.println("To be translated:");
                search = scanner.nextLine();
                translated = simpleDict.translate(search);

                if(!(translated.equals(null))){
                    System.out.println("Translation: " + translated);
                }else{
                    System.out.println("Word (" + search + ") was not found");
                }
                    
            }else{    
                System.out.println("Unknown command");
            }    
            
        }
        
    }
}

