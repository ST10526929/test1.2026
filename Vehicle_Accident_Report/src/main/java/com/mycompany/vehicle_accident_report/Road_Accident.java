
package com.mycompany.vehicle_accident_report;


public abstract class Road_Accident implements IRoadAccidents {
    private String AccidentVehicleType;
    private String City;
    private int AccidentTotal;

      public Road_Accident(String AccidentVehicleType, String City, int AccidentTotal) {
        this.AccidentVehicleType = AccidentVehicleType;
        this.City = City;
        this.AccidentTotal = AccidentTotal;
    }

    public String getAccidentVehicleType() {
        return AccidentVehicleType;
    }

    public String getCity() {
        return City;
    }

    public int getAccidentTotal() {
        return AccidentTotal;
    }
      
}
