package edu.uc.cs3003.medava;

public class Hospital {

    public Hospital(String hospitalName){
        name = hospitalName;
    }

    void receive(Transporter transporter){
        while(!(transporter.isEmpty())) {
            Medicine unloaded = transporter.unload();
            System.out.println(String.format("Checking whether Hospital can receive %s.", unloaded.getMedicineName()));
            if (unloaded.getSchedule() != MedicineSchedule.Uncontrolled) {
                System.out.println(String.format("Hospital cannont receive controlled substances and %s is a %s.", unloaded.getMedicineName(), unloaded.getSchedule().asString()));
            } else {
                System.out.println(String.format("Accepted a shipment of %s.", unloaded.getMedicineName()));
            }
        }
    }

    public String name(){
        return name;
    }

    private String name;
}