package com.mycompany.supermarketsalesreport;
import java.util.Scanner;

public class SupermarketSalesReport {

    public static void main(String[] args) {
        String [] row = {"Cape Town", "Joburg", " Durban"};
        String [] column ={ "Food" ,"Household"};
       
        Scanner input = new Scanner(System.in);
        
        int[][] data = new int[row.length][column.length];
        for (int i = 0; i < row.length; i++) {       // loop through each row
            for (int j = 0; j < column.length; j++) {  // loop through each column in that row
                System.out.print("Enter value for " + row[i] + " " + column[j] + ": ");
                data[i][j] = input.nextInt(); // reads one whole number typed by the user
            }
        }
        
        System.out.println("*".repeat(60));
        System.out.println("Supermarket Sales Report"); 
        System.out.println("*".repeat(60));

        System.out.printf("%-12s", "");
        for (String col : column) {
            System.out.printf("%-10s", col); // print each header, 10 chars wide
        }
        System.out.println(); // move to a new line after all headers are printed

        // Now print every row: the row's label, then every value
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-12s", row[i]); // print this row's label

            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-10d", data[i][j]);
            }
            System.out.println(); // move to a new line after finishing this row
        }

        System.out.println("*".repeat(60));
        System.out.println("Sales Report Summary");
        System.out.println("*".repeat(60)); 
        
        // Variables to track the highest performing branch
        String highestRowLabel = "";
        int highestRowTotal = Integer.MIN_VALUE;

        // Loop to calculate, print totals, and track the highest branch all at once
        for (int i = 0; i < data.length; i++) {
            int rowTotal = 0; // reset the running total to 0 for EACH new row

            for (int j = 0; j < data[i].length; j++) {
                rowTotal += data[i][j]; // add each value in this row to the running total
            }

            // Print just the branch name and the row total
            System.out.printf("%-12s Total: %d%n", row[i], rowTotal);
            
            // Track the branch with the most sales
            if (rowTotal > highestRowTotal) {
                highestRowTotal = rowTotal;
                highestRowLabel = row[i];
            }
        }
        
        System.out.println("*".repeat(60));
        System.out.println("Branch with most sales: " + highestRowLabel + " (Total: " + highestRowTotal + ")");
        System.out.println("*".repeat(60));
    }
}
