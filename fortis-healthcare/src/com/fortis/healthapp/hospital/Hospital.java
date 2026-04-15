package com.fortis.healthapp.hospital;

import com.fortis.healthapp.doctor.Doctor;
public class Hospital {
    Doctor doctor;

    public boolean creatDoctor(Doctor doctor){
        boolean isDoctorCreated=false;
        boolean isDoctorIdValid=false;
        boolean isDoctorNameValid=false;
        boolean isDesignationValid=false;
        if(doctor.getDoctorId()>0) isDoctorIdValid=true;
        if(doctor.getDoctorName()!=null)isDoctorNameValid=true;
        if(doctor.getDesignation()!=null)isDesignationValid=true;

        if(isDesignationValid&&isDoctorIdValid&&isDoctorNameValid){
            isDoctorCreated=true;
            this.doctor=doctor;
        }
return isDoctorCreated;
    }

    public void getDoctorDetails(){
        System.out.println("The doctor Id is: "+doctor.getDoctorId());
        System.out.println("The name of the doctor is: "+doctor.getDoctorName());
        System.out.println("The designation of the doctor is: "+doctor.getDesignation());
    }

}
