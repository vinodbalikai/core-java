package com.fortis.healthapp.doctor;

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String designation;

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDesignation() {
        return designation;
    }
}
