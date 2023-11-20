package edu.uc.cs3003.medava;

public class Hospital {

    public Hospital(String hospitalName){
        name = hospitalName;
    }

    void receive(Transporter transporter){
        while(!(transporter.isEmpty())) {
            Medicine unloaded = transporter.unload();
            System.out.println(String.format("Receiving %s off the %s transporter.", unloaded.getMedicineName(), transporter.getTransporterName()));
        }
    }

    public String name(){
        return name;
    }

    private String name;
}