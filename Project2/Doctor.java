package com.company;

public class Doctor extends Person{
    private String doctor_specialty;

    Doctor(String aFirst, String bLast, String cSpecial) {
        super(aFirst, bLast);
        doctor_specialty = cSpecial;
    }

    public String toString() {
        return super.toString() + " " + doctor_specialty;
    }

    public String getDoctor_specialty() {
        return doctor_specialty;
    }

    public void setDoctor_specialty(String a) {
        doctor_specialty = a;
    }

}
