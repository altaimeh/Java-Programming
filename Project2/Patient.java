package com.company;

import javax.print.Doc;

public class Patient extends Person {
    private int patientID;
    private Date date_of_birth;
    private Doctor physician;
    private Date admitDate;
    private Date dischargeDate;

    Patient(String aFirst, String bLast, int c, Date d, Doctor e, Date f, Date g) {
        super(aFirst, bLast);
        this.patientID = c;
        this.date_of_birth = d;
        this.physician = e;
        this.admitDate = f;
        this.dischargeDate = g;
    }

    public String toString() {
        return "Patient : " + super.toString() +
                "\nDate of Birth : " + date_of_birth +
                "\nAttending Physician : " + physician +
                "\nAdmit Date : " + admitDate +
                "\nDischarge Date : " + dischargeDate;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date a) {
        this.date_of_birth = a;
    }

    public int getPatientID() {
        return this.patientID;
    }

    public void setPatientID(int a) {
        this.patientID = a;
    }

    public Doctor getPhysician() {
        return physician;
    }

    public void setPhysician(Doctor a) {
        this.physician = a;
    }

    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date a) {
        this.admitDate = a;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date a) {
        this.dischargeDate = a;
    }

}
