// Package
package edu.uc.cs3003.medava;

// Imports
import java.util.List;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Class: Transporter
public class Transporter {

    private String mTransporterName;
    private Double mLowTemperature, mHighTemperature;
    private List<Shippable> goods;

    {
        goods = new ArrayList<Shippable>();
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

    // public Boolean load(Object itemToLoad) {
    //     try {
    //         Method isTemperatureRangeAcceptable = itemToLoad.getClass().getMethod("isTemperatureRangeAcceptable", Double.class, Double.class);
    //         Boolean resultOfMethodCall = (Boolean) isTemperatureRangeAcceptable.invoke(itemToLoad, Double.valueOf(mLowTemperature), Double.valueOf(mHighTemperature));
    //         if (resultOfMethodCall) {
    //             goods.add(itemToLoad);
    //             return true;
    //         }
    //         return resultOfMethodCall;
    //     } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
    //         return false;
    //     }
    // }

    public Boolean load(Shippable itemToLoad){
        if(itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)){
            return goods.add(itemToLoad);
        }
        return false;
    }

    // public Object unload() {
    //     return goods.remove(0);
    // }

    public Shippable unload(){
        return goods.remove(0);
    }

    public Boolean isEmpty() {
        return goods.isEmpty();
    }
}