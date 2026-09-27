/*
 * FILE 3 OF 4: THE SUBCLASS
 * ------------------------------------------------------------
 * This class EXTENDS the abstract class and does two jobs:
 *   1. Passes constructor values up to the abstract class via super()
 *   2. Implements the interface method(s) - THIS is where the
 *      actual business logic/if-else from the question goes.
 *
 * Rename SomethingProcessor to match the scenario, e.g.
 * TicketSales, SpeedingFines, ProcessRecipe, StaffHiring,
 * RoadAccidentReport.
 *
 * Save this file as: SomethingProcessor.java
 */

public class SomethingProcessor extends Somethingbase {

    // Constructor just forwards the values to the abstract class
    public SomethingProcessor(String fieldOne, int fieldTwo) {
        super(fieldOne, fieldTwo);
    }

    // This is the method required by the interface.
    // Put the calculation/decision logic the question describes
    // here, then print the formatted report.
    @Override
    public void printSomething() {

        // ---- EXAMPLE BUSINESS LOGIC (adapt to the real question) ----
        // Common patterns from past papers:
        //   - age >= 65        -> apply 10% discount
        //   - speed >= 120     -> fine = speed * rate
        //   - staff < 20       -> hire = YES
        //   - amount >= X      -> print a status/star flag

        double result = getFieldTwo();
        if (getFieldTwo() >= 65) {
            result = result * 0.9; // placeholder discount example
        }

        // ---- PRINT THE REPORT - match sample wording/format exactly ----
        System.out.println("*".repeat(35));
        System.out.println("FIELD ONE: " + getFieldOne());
        System.out.println("FIELD TWO: " + getFieldTwo());
        System.out.println("RESULT: " + result);
        System.out.println("*".repeat(35));
    }
}