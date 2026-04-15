package com.fortis.healthapp;

import com.fortis.healthapp.doctor.Doctor;
import com.fortis.healthapp.hospital.Hospital;

public class HospitalExecuter {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Hospital hospital=new Hospital();
        Doctor doctor=new Doctor();
        doctor.setDoctorId(17);
        doctor.setDoctorName("Dev");
        doctor.setDesignation("Neurologist");

        boolean isDoctorCreated=hospital.creatDoctor(doctor);
        System.out.println("The Doctor Created: "+isDoctorCreated);

        hospital.getDoctorDetails();



        System.out.println("Main Ended");
    }
}
