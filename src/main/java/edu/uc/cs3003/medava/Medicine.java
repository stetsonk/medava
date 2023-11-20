package edu.uc.cs3003.medava;

public class Medicine {
    public Medicine(String medicineName){
        medicineName = medicineName;
    }

    public String getMedicineName(){
        return medicineName;
    }

    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature){
        if(this.minimumTemperature() <= lowTemperature && highTemperature <= this.maximumTemperature()){
            return true;
        }
        return false;
    }

    public Double minimumTemperature(){
        return 0.0;
    }

    public Double maximumTemperature(){
        return 100.0;
    }
    

    private String medicineName;

}