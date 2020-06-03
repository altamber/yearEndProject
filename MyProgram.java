import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        System.out.println("Hello! this is my final project for my APCSA class!!! I created a recipe book class that allows you to");
        System.out.print("tell the program what ingredients you have to work with and if you have all of the ingredients for the recipe!");
        RecipeConstruct myBook = new RecipeConstruct("kidney beans", "crushed tomatoes", "salt", "pepper", "ground beef", "chicken stock", 7);
        System.out.println(" ");
        System.out.println("This is the tester file, this will show how the program works, all parameters have already been inputted in order t ensure no bugs.");
        System.out.println("i created an object of the RecipeConstruct class that will allow us to work within it");
        myBook.addIngredient("peppers");
        myBook.prntIng();
        myBook.addIngredient("sausage");
        myBook.addIngredient("crushed tomatoes");
        myBook.addIngredient("salt");
        myBook.addIngredient("ground beef");
        myBook.addIngredient("chicken stock");
        myBook.prntIng();
        myBook.addRecipe("sausage", "white wine", "chicken stock", "french fries", "pepper", "jack fruit");
        System.out.println(myBook.cook(1));
        myBook.deleteIngredient("salt");
        myBook.prntIng();
    }
}
