
package com.mycompany.vehicle_accident_report;
import java.util.Scanner;

public class Vehicle_Accident_Report {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Match these prompts EXACTLY to the sample screenshot wording
        System.out.print("Enter the Vehicle: ");
        String  AccidentVehicleType = input.nextLine();

        System.out.print("Enter the City: ");
        String City = input.nextLine();
        
        System.out.println("Enter total number for " + City + " :");
        int AccidentTotal = input.nextInt();
        
       

        // Instantiate the SUBCLASS
    
       Road_Accident_Report report = new Road_Accident_Report(AccidentVehicleType, City, AccidentTotal);

        // Call the method that prints the report
      report.printAccidentReport();

        input.close();
    }
}
