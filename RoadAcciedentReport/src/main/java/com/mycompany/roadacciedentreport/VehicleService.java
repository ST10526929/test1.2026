
package com.mycompany.roadacciedentreport;


public abstract class VehicleService implements iVehichleService  {
 
    
    private String VehicleType;
    private String City;
    private int ServiceTotal;

    public VehicleService(String VehicleType, String City, int ServiceTotal) {
        this.VehicleType = VehicleType;
        this.City = City;
        this.ServiceTotal = ServiceTotal;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public String getCity() {
        return City;
    }

    public int getServiceTotal() {
        return ServiceTotal;
    }

  

    
}
