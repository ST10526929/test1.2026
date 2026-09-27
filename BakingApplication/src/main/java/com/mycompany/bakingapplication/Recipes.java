
package com.mycompany.bakingapplication;

public abstract class Recipes implements iRecipes{
    private String ingredients;
    private int timeToMake;
    private int difficultyLevel;

    public Recipes(String ingredients, int timeToMake, int difficultyLevel) {
        this.ingredients = ingredients;
        this.timeToMake = timeToMake;
        this.difficultyLevel = difficultyLevel;
    
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getTimeToMake() {
        return timeToMake;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }
    
    
    
}
