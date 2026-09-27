
package com.mycompany.roadacciedentreport;

public class VehicleServiceReport extends VehicleService {

    public VehicleServiceReport(String VehicleType, String City, int ServiceTotal) {
        super(VehicleType, City, ServiceTotal);
        
  System.out.println("*".repeat(35));
   System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("City: " + getCity());
        System.out.println("Total number of Services: " + getServiceTotal());
        System.out.println("*".repeat(35));
    }

    void printVehichleService() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     
        
   
    
        
   
   
}


