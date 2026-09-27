

package com.mycompany.bakingapplication;
import java.util.Scanner;

public class BakingApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Match these prompts EXACTLY to the sample screenshot wording
        System.out.print("Enter the ingredients: ");
        String ingredients = input.nextLine();

        System.out.print("Enter the time to make (minutes): ");
        int timeToMake = input.nextInt();
        
        System.out.println("Enter Difficulty level: ");
        int difficultyLevel =input.nextInt();
        

        // Instantiate the SUBCLASS
      ProcessRecipes recipe = new ProcessRecipes(ingredients, timeToMake, difficultyLevel);


        // Call the method that prints the report
        recipe.PrintRecipes();

        input.close();
    }
}

