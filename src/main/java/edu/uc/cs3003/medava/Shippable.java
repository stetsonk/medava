package edu.uc.cs3003.medava;

public interface Shippable {

    public MedicineSchedule getSchedule();
    public String getMedicineName();
    public Boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature);
    
}