// Package
package edu.uc.cs3003.medava;

// Imports
import java.util.List;
import java.util.ArrayList;

// Class: Transporter
public class Transporter {

    private String mTransporterName;
    private Double mLowTemperature, mHighTemperature;
    private List<Medicine> goods;

    {
        goods = new ArrayList<Medicine>();
    }

    public Transporter(String transporterName, Double lowTemperature, Double highTemperature){
        mTransporterName = transporterName;
        mLowTemperature = lowTemperature;
        mHighTemperature = highTemperature;
    }

    public String getTransporterName(){
        return mTransporterName;
    }

    public void ship() {
        // Do some shipping!
    }

    public Boolean load(Medicine itemToLoad) {
        if(itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            System.out.println(String.format("Adding a %s to the transporter.", itemToLoad.getMedicineName()));
            goods.add(itemToLoad);
            return true;
        }
        return false;
    }

    public Medicine unload() {
        return goods.remove(0);
    }

    public Boolean isEmpty() {
        return goods.isEmpty();
    }
}