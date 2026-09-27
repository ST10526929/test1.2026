
package com.mycompany.bakingapplication;

public class ProcessRecipes extends Recipes {

    public ProcessRecipes(String ingredients, int timeToMake, int difficultyLevel) {
        super(ingredients, timeToMake, difficultyLevel);
    }

    @Override
    public void PrintRecipes() {
        
    System.out.println("*".repeat(35));
        
        System.out.println("INGREDIENTS: " + getIngredients());
        
        System.out.println("TIME TO MAKE: " + getTimeToMake() 
);
        
        System.out.println("DIFFICULTY LEVEL: " + getDifficultyLevel() );
        System.out.println("*".repeat(35));
    
      
    
    }
        
   
    
    
    
    
}
