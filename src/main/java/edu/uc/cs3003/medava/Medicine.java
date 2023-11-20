package edu.uc.cs3003.medava;

public abstract class Medicine {

    private String medicineName;

    public abstract MedicineSchedule getSchedule();

    public Medicine(String medicineName){
        this.medicineName = medicineName;
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

}