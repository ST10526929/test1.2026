/*
 * ============================================================
 * TEMPLATE: QUESTION 1 - ADVANCED ARRAY REPORT (DETAILED VERSION)
 * ============================================================
 * This version has extra comments explaining WHY each line works,
 * not just what to change. Read through it once before the exam
 * so the logic is familiar, then swap in the real question's
 * labels/values/logic on the day.
 *
 * HOW TO ADAPT THIS TEMPLATE (quick checklist):
 *   1. Rename the class, row labels, and column labels to match
 *      the actual question (e.g. vehicle types, cities, months).
 *   2. Replace the values in the 2D array with the table given
 *      in the question paper.
 *   3. Change rowLabels / colHeaders to match the given table.
 *   4. Pick ONE of the three STATISTIC LOGIC options below
 *      (delete the other two) and adjust the threshold/condition.
 *   5. Adjust the printed report formatting (borders, spacing,
 *      headings) to resemble the sample screenshot as closely
 *      as possible - this is worth marks on its own.
 *
 * Compulsory: keep comments in your final code (marks are
 * allocated for this in every paper's rubric).
 * ============================================================
 */

import java.util.Scanner; // Lets us read input from the keyboard, IF the question asks for typed input rather than hardcoded values.

public class Q1_Template_Test {

    // main() is the entry point - this is the method Java runs first
    // when the program starts. Everything for this question happens
    // inside here because it's a small console application.
    public static void main(String[] args) {

        // ------------------------------------------------------
        // STEP 1: DECLARE AND POPULATE THE 2D ARRAY
        // ------------------------------------------------------

        // rowLabels holds the NAME of each row (what appears down
        // the left-hand side of the table in the question).
        // Example from past papers: {"SUV", "COUPE", "SEDAN", "VAN"}
        // or {"JHB", "DBN", "CTN", "PE"} or {"DELIVEIESR 2018", ...}
        String[] rowLabels = {"ROW1", "ROW2", "ROW3", "ROW4"};

        // colHeaders holds the NAME of each column (what appears
        // across the top of the table). Usually months, but could
        // be anything the question specifies.
        String[] colHeaders = {"JAN", "FEB", "MAR"};

        // data[][] is the actual 2D array (a "table" made of rows
        // and columns). In Java, data[i][j] means:
        //     i = which row (0 = first row, 1 = second row, etc.)
        //     j = which column (0 = first column, 1 = second, etc.)
        // So data[0][0] is the value in the FIRST row, FIRST column.
        // data[2][1] is the value in the THIRD row, SECOND column.
        // Copy the numbers straight from the table given in the
        // question, row by row, in the same order as rowLabels above.
        int[][] data = {
            {25, 15, 35},   // ROW1 -> JAN=25, FEB=15, MAR=35
            {25, 55, 35},   // ROW2
            {11, 20, 45},   // ROW3
            {17, 27, 25}    // ROW4
        };

        // ALTERNATIVE: if the question specifically asks the USER
        // to TYPE IN the values (instead of you hardcoding them),
        // use a Scanner and a nested loop like this instead of the
        // hardcoded array above:
        //
        // Scanner input = new Scanner(System.in);
        // int[][] data = new int[rowLabels.length][colHeaders.length];
        // for (int i = 0; i < rowLabels.length; i++) {       // loop through each row
        //     for (int j = 0; j < colHeaders.length; j++) {  // loop through each column in that row
        //         System.out.print("Enter value for " + rowLabels[i] + " " + colHeaders[j] + ": ");
        //         data[i][j] = input.nextInt(); // reads one whole number typed by the user
        //     }
        // }
        // Only do this if the question explicitly says "prompt the
        // user to enter..." - most past papers just give you a
        // table to hardcode.

        // ------------------------------------------------------
        // STEP 2: PRINT THE REPORT TABLE (rows and columns)
        // ------------------------------------------------------

        // "*".repeat(60) creates a string of 60 asterisks in a row -
        // an easy way to draw a border line without typing it out.
        // Change 60 to roughly match the width of the sample report.
        System.out.println("*".repeat(60));
        System.out.println("REPORT TITLE HERE"); // e.g. "VEHICLE SALES REPORT"
        System.out.println("*".repeat(60));

        // printf() lets us control exact spacing so columns line up,
        // unlike println() which just prints and moves to a new line.
        // %-12s means: print a String, left-aligned, padded with
        // spaces to take up 12 characters of width. The "-" makes it
        // left-aligned (no "-" would right-align it).
        // We first print an empty 12-character gap so the column
        // headers line up above the data rows below (since row
        // labels also take up 12 characters of width).
        System.out.printf("%-12s", "");
        for (String col : colHeaders) {
            System.out.printf("%-10s", col); // print each header, 10 chars wide
        }
        System.out.println(); // move to a new line after all headers are printed

        // Now print every row: the row's label, then every value
        // in that row, using the SAME width formatting as the
        // headers above so everything lines up in neat columns.
        for (int i = 0; i < data.length; i++) {
            // data.length = the number of ROWS in the array (4 in this example)
            System.out.printf("%-12s", rowLabels[i]); // print this row's label


            for (int j = 0; j < data[i].length; j++) {
                // data[i].length = the number of COLUMNS in row i (3 in this example)
                // %-10d means: print an integer (whole number), left-aligned,
                // padded to 10 characters wide.
                System.out.printf("%-10d", data[i][j]);
            }
            System.out.println(); // move to a new line after finishing this row
        }

        System.out.println("*".repeat(60));

        // ------------------------------------------------------
        // STEP 3: STATISTIC LOGIC - PICK ONE OPTION, ADAPT IT,
        // DELETE THE OTHER TWO. Read the question carefully to
        // work out which calculation is actually being asked for.
        // ------------------------------------------------------
        System.out.println("STATISTICS SECTION HEADING HERE"); // e.g. "VEHICLE TOTAL SALES"
        System.out.println("*".repeat(60));

        // ============================================================
        // OPTION A: Row totals with a status flag (gold/silver style)
        // Use this when the question asks you to add up each ROW and
        // then apply a condition to that row's total (e.g. "if total
        // sales per row >= 100, award gold status, else silver status").
        // ============================================================
        for (int i = 0; i < data.length; i++) {
            int rowTotal = 0; // reset the running total to 0 for EACH new row

            for (int j = 0; j < data[i].length; j++) {
                rowTotal += data[i][j]; // add each value in this row to the running total
                // rowTotal += data[i][j] is shorthand for:
                // rowTotal = rowTotal + data[i][j];
            }

            // The ternary operator ( condition ? valueIfTrue : valueIfFalse )
            // is a compact if/else that returns one of two values.
            // This line is equivalent to writing:
            //     String status;
            //     if (rowTotal >= 100) { status = "(Gold Star)"; }
            //     else { status = "(Silver Star)"; }
            String status = (rowTotal >= 100) ? "(Gold Star)" : "(Silver Star)";

            // %n is a newline (like println but usable inside printf/format strings).
            // This prints: rowLabel, then the total, then the status, all aligned.
            System.out.printf("%-10s %-6d %s%n", rowLabels[i], rowTotal, status);
        }

        // ============================================================
        // OPTION B: Overall max and min (and optionally total) across
        // the WHOLE array (every value in every row and column).
        // Use this when the question asks for "the highest/lowest
        // value recorded" rather than a per-row total.
        // ============================================================
        // Start max and min off equal to the very first value in the
        // array, then compare every other value against them and
        // update whenever we find something bigger/smaller.
        int max = data[0][0];
        int min = data[0][0];
        int overallTotal = 0;

        for (int i = 0; i < data.length; i++) {           // go through every row
            for (int j = 0; j < data[i].length; j++) {    // go through every column in that row
                overallTotal += data[i][j]; // keep adding up every single value

                if (data[i][j] > max) {
                    max = data[i][j]; // found a new highest value - remember it
                }
                if (data[i][j] < min) {
                    min = data[i][j]; // found a new lowest value - remember it
                }
            }
        }
        System.out.println("Total: " + overallTotal);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // ============================================================
        // OPTION C: Identify which ROW has the highest total.
        // Use this when the question asks something like "display
        // the city/category with the most accidents/deliveries/sales".
        // ============================================================
        String highestRowLabel = "";
        // Integer.MIN_VALUE is the smallest possible int value in Java -
        // we start here so that ANY real row total will be bigger than
        // it the very first time we compare, guaranteeing it gets replaced.
        int highestRowTotal = Integer.MIN_VALUE;

        for (int i = 0; i < data.length; i++) {
            int rowTotal = 0; // reset for each row, same idea as Option A

            for (int j = 0; j < data[i].length; j++) {
                rowTotal += data[i][j];
            }

            // If this row's total beats the best one we've seen so far,
            // remember both the new total AND which row it belongs to.
            if (rowTotal > highestRowTotal) {
                highestRowTotal = rowTotal;
                highestRowLabel = rowLabels[i];
            }
        }
        System.out.println("ROW WITH THE HIGHEST TOTAL: " + highestRowLabel);

        // ------------------------------------------------------
        // STEP 4: CLOSE OFF THE REPORT
        // ------------------------------------------------------
        // Always finish with a matching border line so the report
        // looks complete and matches the "boxed" look of the sample
        // screenshots in the question paper.
        System.out.println("*".repeat(60));
    }
}