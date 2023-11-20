package edu.uc.cs3003.medava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Hospital {

    public Hospital(String hospitalName){
        name = hospitalName;
    }

    // void receive(Transporter transporter){
    //     while (!transporter.isEmpty()) {
    //         try {
    //             Object unloaded = transporter.unload();
    //             Method getScheduleMethod = unloaded.getClass().getMethod("getSchedule");
    //             MedicineSchedule getScheduleMethodResult = (MedicineSchedule) getScheduleMethod.invoke(unloaded);
    //             Method getMedicineNameMethod = unloaded.getClass().getMethod("getMedicineName");
    //             String getMedicineNameMethodResult = (String) getMedicineNameMethod.invoke(unloaded);
    //             System.out.println(String.format("Checking whether Hospital can receive %s.", getMedicineNameMethodResult));
    //             if (getScheduleMethodResult != MedicineSchedule.Uncontrolled) {
    //                 System.out.println(String.format("Hospital cannot receive controlled substances and %s is a %s", getMedicineNameMethodResult, getScheduleMethodResult.asString()));
    //             } else {
    //                 System.out.println(String.format("Accepted a shipment of %s.", getMedicineNameMethodResult));
    //             }
    //         } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
    //         // Do nothing
    //         }
    //     }
    // }

    void receive(Transporter transporter){
        while(!transporter.isEmpty()){
            Shippable unloaded = transporter.unload();
            System.out.println(String.format("Checking whether Hospital can receive %s.", unloaded.getMedicineName()));
            if(unloaded.getSchedule() != MedicineSchedule.Uncontrolled){
                System.out.println(String.format("Hospital cannot receive controlled substances and %s is a %s", unloaded.getMedicineName(), unloaded.getSchedule().asString()));
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