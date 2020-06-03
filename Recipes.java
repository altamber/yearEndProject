 
public class Recipes
{
    private String [] ingredientsList = new String [6];
    
    //Add constructor here
    public Recipes(String ingA, String ingB, String ingC, String ingD, String ingE, String ingF){
        ingredientsList[0] = ingA;
        ingredientsList[1] = ingB;
        ingredientsList[2] = ingC;
        ingredientsList[3] = ingD;
        ingredientsList[4] = ingE;
        ingredientsList[5] = ingF;
    }
    public String [] getIngr(){
        return ingredientsList;
    }
    public String getIngA(){
        return ingredientsList[0];
    }
    public String getIngB(){
        return ingredientsList[1];
    }
    public String getIngC(){
        return ingredientsList[2];
    }
    public String getIngD(){
        return ingredientsList[3];
    }
    public String getIngE(){
        return ingredientsList[4];
    }
    public String getIngF(){
        return ingredientsList[5];
    }
    
    
    
}
