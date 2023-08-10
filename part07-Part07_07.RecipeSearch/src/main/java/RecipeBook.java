import java.util.ArrayList;

public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void printRecipeByName(String name) {
        if (recipes.isEmpty()) {
            System.out.println("Recipe Book has no entries");
        } else {
            for (Recipe recipe : recipes) {
                if (recipe.getRecipeName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(recipe);
                }
            }
        }
    }

    public void printRecipeByTime(String time) {
        int duration  = Integer.valueOf(time);
        if (recipes.isEmpty()) {
            System.out.println("Recipe Book has no entries");
        } else {
            for (Recipe recipe : recipes) {
               if (recipe.getRecipeTime() <= duration) {
                    System.out.println(recipe);
                }
            }
        }
    }

    public void printRecipeByIngredient(String ingredient) {
        if (recipes.isEmpty()) {
            System.out.println("Recipe Book has no entries");
        } else {
            for (Recipe recipe : recipes) {
                if (recipe.getRecipeIngredients().contains(ingredient.toLowerCase())) {
                    System.out.println(recipe);
                }
            }
        }
    }

    public void printRecipeBook() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);

        }
    }
}
