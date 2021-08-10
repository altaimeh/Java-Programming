package com.company;

public class Bill {
    private int patientID;
    private double pharmacyCharge;
    private double roomCharge;
    private double doctorsFee;

    Bill(int a, double b, double c, double d) {
        this.patientID = a;
        this.pharmacyCharge = b;
        this.roomCharge = c;
        this.doctorsFee = d;
    }

    public String toString() {
        return "Pharmacy Charges : " + pharmacyCharge +
                "\nRoom Charges : " + roomCharge +
                "\nDoctor Fees : " + doctorsFee +
                "\n**********************" +
                "\nTotal Charge : " + (pharmacyCharge + roomCharge + doctorsFee);
    }

    public int getPatientID() {
        return this.patientID;
    }

    public double getPharmacyCharge() {
        return this.pharmacyCharge;
    }

    public double getRoomCharge() {
        return this.roomCharge;
    }

    public double getDoctorsFee() {
        return this.doctorsFee;
    }

    public void setPatientID(int a) {
        this.patientID = a;
    }

    public void setPharmacyCharge(double b) {
        this.pharmacyCharge = b;
    }

    public void setRoomCharge(double c) {
        this.roomCharge = c;
    }

    public void setDoctorsFee(double d) {
        this.doctorsFee = d;
    }

}
