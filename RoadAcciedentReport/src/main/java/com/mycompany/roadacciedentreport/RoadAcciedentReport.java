
package com.mycompany.roadacciedentreport;
import java.util.Scanner;
public class RoadAcciedentReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Match these prompts EXACTLY to the sample screenshot wording
        System.out.print("Enter Vehicle Type: ");
        String VehicleType = input.nextLine();
        
        System.out.println("Enter City: ");
        String City = input.nextLine();

        System.out.print("Enter the Total Number Of Services: ");
        int ServiceTotal= input.nextInt();

        // Instantiate the SUBCLASS
        VehicleServiceReport report = new VehicleServiceReport(VehicleType, City, ServiceTotal);

        // Call the method that prints the report
        //processor.printSomething();
        report.printVehichleService();

        input.close();
    }
}
    
