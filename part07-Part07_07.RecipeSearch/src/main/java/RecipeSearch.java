
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        RecipeBook newRecipeBook = new RecipeBook();
        String ingredients[];
        String name;
        String time;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("Commands:");
        System.out.println("booklist - print enire recipe book");
        System.out.println("namelist - lists the recipes by name");
        System.out.println("timelist - lists the recipes by time");
        System.out.println("ingredientslist - lists the recipes by ingredients");
        System.out.println("stop - stops the program");
        System.out.print("Enter command: ");
        String command = scanner.nextLine();

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            ArrayList<String> recipes = new ArrayList<>();
            
            while(scanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(line.trim().isEmpty() || !fileScanner.hasNextLine()){
                    name = recipes.get(0);     
                    time = recipes.get(1);
                    ArrayList<String> recipesIng = new ArrayList<>();
                    for(int i = 2 ; i < recipes.size();++i ){
                        recipesIng.add(recipes.get(i));
                    }
                    int intTime = Integer.valueOf(time);
                    newRecipeBook.addRecipe(new Recipe(name, intTime,recipesIng));
                    recipes.remove(line);
                }else{
                    recipes.add(line);
                }
                
                
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        if(command.equals("booklist")){
            newRecipeBook.printRecipeBook();
        }
        
        if(command.equals("namelist")){
            newRecipeBook.printRecipeByName(command);
        }

        if(command.equals("timelist")){
            newRecipeBook.printRecipeByTime(command);
        }

        if(command.equals("ingredientslist")){
            newRecipeBook.printRecipeByIngredient(command);
        }

        if(command.equals("stop")){
            System.exit(0);
        }

    }

}
