
package com.mycompany.vehicle_accident_report;


public class Road_Accident_Report extends Road_Accident {

    public Road_Accident_Report(String AccidentVehicleType, String City, int AccidentTotal) {
        super(AccidentVehicleType, City, AccidentTotal);
    }

   
    
    
    

     public void printAccidentReport() {
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("------------------------------------");
        System.out.println("VEHICLE TYPE:      " + getAccidentVehicleType());
        System.out.println("CITY:              " + getCity());
        System.out.println("TOTAL ACCIDENTS:   " +getAccidentTotal());
        System.out.println("------------------------------------");
    }

  
}

  
    
