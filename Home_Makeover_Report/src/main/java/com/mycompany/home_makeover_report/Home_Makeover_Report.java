
package com.mycompany.home_makeover_report;

public class Home_Makeover_Report {

    public static void main(String[] args) {
        String [] row = {"January", "February", " March", "April", "May" ,"June"};
        String [] column  ={"Bathroom" , "Kitchen" , "Garden"};
        
        // data[][] is the actual 2D array (a "table" made of rows
        // and columns). In Java, data[i][j] means:
        //     i = which row (0 = first row, 1 = second row, etc.)
        //     j = which column (0 = first column, 1 = second, etc.)
        // So data[0][0] is the value in the FIRST row, FIRST column.
        // data[2][1] is the value in the THIRD row, SECOND column.
        
        int data [][] = {
            {8, 2,5},
            {7, 4, 5},
            {5, 5, 2},
            {2, 2, 3},
            {7, 7, 9},
            {7, 8, 5}
        };
         System.out.println("*".repeat(60));
        System.out.println("Home Makeover Report"); 
        System.out.println("*".repeat(60));
        System.out.printf("%-12s", "");
        
        
        for (String col : column) {
            System.out.printf("%-10s", col); // print each header, 10 chars wide
        }
        System.out.println(); 
        
          for (int i = 0; i < data.length; i++) {
            // data.length = the number of ROWS in the array (4 in this example)
            System.out.printf("%-12s", row[i]); // print this row's label


            for (int j = 0; j < data[i].length; j++) {
                // data[i].length = the number of COLUMNS in row i (3 in this example)
                // %-10d means: print an integer (whole number), left-aligned,
                // padded to 10 characters wide.
                System.out.printf("%-10d", data[i][j]);
            }
            System.out.println(); // move to a new line after finishing this row
        }

        System.out.println("*".repeat(60));
 System.out.println("Monthly Total"); 
        System.out.println("*".repeat(60));
        
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
            //     if (rowTotal >= 15) { status = "***"; }
            //     else { status = " "; }
           String status = (rowTotal >= 15) ? "***" : " ";

            // %n is a newline (like println but usable inside printf/format strings).
            // This prints: rowLabel, then the total, then the status, all aligned.
            System.out.printf("%-10s %-6d %s%n", row[i], rowTotal, status);
        }

        
    }
}
