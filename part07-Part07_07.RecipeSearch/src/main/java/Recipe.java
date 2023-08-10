import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int recipeTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int recipeTime, ArrayList<String> ingredients) {
        this.recipeName = recipeName;
        this.recipeTime = recipeTime;
        this.ingredients = ingredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getRecipeTime() {
        return recipeTime;
    }

    public ArrayList<String> getRecipeIngredients() {
        return ingredients;
    }

    @Override
    public String toString(){
        return recipeName + " takes " + recipeTime + "mins to prepare.";  
    }
    
}
