package edu.uc.cs3003.medava;

public class Pharmacy {

    public Pharmacy(String pharmacyName){
        mPharmacyName = pharmacyName;
    }

    public Boolean send(Transporter transporter) {
        Medicine advil = new Ibuprofen();
        if (transporter.load(advil)) {
            System.out.println(String.format("Sending %s on the %s transporter.", advil.getMedicineName(), transporter.getTransporterName()));
        } else {
            System.out.println(String.format("Cannont load %s on the %s transporter", advil.getMedicineName(), transporter.getTransporterName()));
            return false;
        }

        Medicine activase = new Thrombolytic();
        if(transporter.load(activase)){
            System.out.println(String.format("Sending %s on the %s transporter.", activase.getMedicineName(), transporter.getTransporterName()));
        } else {
            System.out.println(String.format("Cannont load %s on the %s transporter", activase.getMedicineName(), transporter.getTransporterName()));
            return false;
        }

        Medicine oxycontin = new Oxycodone();
        if (transporter.load(oxycontin)) {
            System.out.println(String.format("Sending %s on the %s transporter.", oxycontin.getMedicineName(), transporter.getTransporterName()));
        } else {
            System.out.println(String.format("Cannont load %s on the %s transporter", oxycontin.getMedicineName(), transporter.getTransporterName()));
            return false;
        }
        return true;
    }

    public String pharmacyName() {
        return mPharmacyName;
    }

    private String mPharmacyName;


}