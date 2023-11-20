package edu.uc.cs3003.medava;

public class Oxycodone extends Medicine {
    public Oxycodone(){
        super("Oxycodone");
    }

    @Override
    public MedicineSchedule getSchedule(){
        return MedicineSchedule.Two;
    }

    // @Override
    // public Double minimumTemperature(){
    //     return 40.0;
    // }

    // @Override
    // public Double maximumTemperature(){
    //     return 80.0;
    // }
}