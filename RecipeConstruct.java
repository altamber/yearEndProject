public class RecipeConstruct
{
    private Recipes[] recipeBook = new Recipes[7];
    private String[] ingreds = new String[20];
    private int lembs;
    private int cont;
    //creates a recipe book and adds the first recipe to the book
    //also calls the recipe constructor which actially creates 
    //a recipe 
    public RecipeConstruct(String a, String b, String c, String d, String e, String f, int lamb){
        Recipes og = new Recipes(a, b, c, d, e, f);
        recipeBook[0] = og;
        lembs = lamb;
        cont = 0;
    }
    //this will allow for the user to enter an ingredient 
    //that they have in their house that will be used in the future
    // in order to call a different function that allows the program to 
    // tell the user if they have all of the ingredients needed for a certian recipe 
    
    public void addIngredient(String ings){
        if(ingreds[19] == null){
            for(int i = 0; i < 20; i++){
                if(ingreds[i] == null){
                    ingreds[i] = ings;
                    System.out.println("Ingredient " + ings + " was added successfully");
                    break;
                }
            }
        } else {
            System.out.println("Sorry, there was an error, please try deleting an ingredient to make space!!");
        }
    }
    //This will allow the user to take an ingredient away from the list
    //allowing for a more accurate program
    
    public void deleteIngredient(String ingreed){
        int count = 0;
        for(int i = 0; i < ingreds.length; i++){
            if(ingreds[i] == ingreed){
                ingreds[i] = null;
                System.out.println("Ingredient added");
                count++;
                break;
            }
        }
        if(count > 0){
            System.out.println("Ingredient not found, please make sure you spelt it correctly");
        }
    }
    // calling this will allow a person to add a recipe to the recipe bool
    // it will ask for 6 
    public void addRecipe(String uno, String dos, String tres, String cuatro, String cinco, String seis){
        Recipes add = new Recipes(uno, dos, tres, cuatro, cinco, seis);
        cont++;
        recipeBook[cont] = add;
        System.out.println("Recipe added with ingredients: " + uno + " "+ dos + " "+ tres + " "+ cuatro + " "+ cinco + " "+ seis + " ");
    }
    //finally, the cook function allows for you to call on a recipe and see if you have all of the ingredients
    // i hope this works, but the parameter it takes is the number for the array
    public String cook(int index){
        String[] ingCompare = recipeBook[index].getIngr();
        String missingIngA = " ";
        String missingIngB= " ";
        String missingIngC = " ";
        String missingIngD = " ";
        String missingIngE = " ";
        String missingIngF = " ";
        int counter = 0;
        for(int i = 0; i < ingreds.length; i++){
            if(ingCompare[0] == ingreds[i]){
                counter++;
                
            }
            
        }
        if(counter < 1){
            missingIngA = ingCompare[0];
        }
        //checks second ingredient
        counter = 0;
        for(int i = 0; i < ingreds.length; i++){
            if(ingCompare[1] ==ingreds[i]){
                counter++;
                
            }
            
        }
        if(counter < 1){
            missingIngB = ingCompare[1];
        }
        //checks third ingredint 
        counter = 0;
        for(int i = 0; i < ingreds.length; i++){
            if(ingCompare[2] ==ingreds[i]){
                counter++;
                
            }
            
        }
        if(counter < 1){
            missingIngC = ingCompare[3];
        }
        //checks Fourth ingredint 
        counter = 0;
        for(int i = 0; i < ingreds.length; i++){
            if(ingCompare[3] ==ingreds[i]){
                counter++;
                
            }
            
        }
        if(counter < 1){
            missingIngD = ingCompare[3];
        }
        //checks Fith ingredint 
        counter = 0;
        for(int i = 0; i < ingreds.length; i++){
            if(ingCompare[4] ==ingreds[i]){
                counter++;
                
            }
            
        }
        if(counter < 1){
            missingIngE = ingCompare[4];
        }
        //checks last ingredint 
        counter = 0;
        for(int i = 0; i < ingreds.length; i++){
            if(ingCompare[5] ==ingreds[i]){
                counter++;
                
            }
            
        }
        if(counter < 1){
            missingIngF = ingCompare[5];
        }
        
        return"Missing ingredients are as follows(if none appear, you have all) : " + missingIngA + " "+ missingIngB + " " + missingIngC + " "+ missingIngD + " "+ missingIngE + " "+ missingIngF + " ";
    }
    // this will show all ingredients
    public void prntIng(){
        System.out.println("Current ingredients are");
        for(int x = 0; x < ingreds.length; x++){
            if(ingreds[x] != null){
                System.out.println(ingreds[x]);
            }
        }
    }
    
}
