/*
 * FILE 4 OF 4: THE DRIVER / APPLICATION CLASS
 * ------------------------------------------------------------
 * This is the class with main(). It:
 *   1. Captures user input with Scanner (match prompts to the
 *      sample screenshot in the question, word for word if you can)
 *   2. Instantiates the SUBCLASS (never the abstract class directly -
 *      you cannot "new" an abstract class in Java)
 *   3. Calls the interface method to produce the report
 *
 * Rename RunApplication to match the scenario, e.g. Movie_Tickets,
 * SpeedingFineApplication, BakingApplication, UseStaff,
 * RunApplication.
 *
 * Save this file as: RunApplication.java
 */

import java.util.Scanner;

public class Q2_Inheritance_TemplateTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Match these prompts EXACTLY to the sample screenshot wording
        System.out.print("Enter the field one value: ");
        String fieldOne = input.nextLine();

        System.out.print("Enter the field two value: ");
        int fieldTwo = input.nextInt();

        // Instantiate the SUBCLASS
        SomethingProcessor processor = new SomethingProcessor(fieldOne, fieldTwo);

        // Call the method that prints the report
        processor.printSomething();

        input.close();
    }
}