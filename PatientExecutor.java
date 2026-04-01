class PatientExecutor {
    public static void main(String[] args) {

        Patient p1 = new Patient();

        p1.setPatientName("Vinod");
        System.out.println("Patient Name: " + p1.getPatientName());

        p1.setAge(22);
        System.out.println("Age: " + p1.getAge());

        p1.setDisease("Fever");
        System.out.println("Disease: " + p1.getDisease());

        p1.setWeight(64.5);
        System.out.println("Weight: " + p1.getWeight());

        p1.setDoctorName("Dr. Sharma");
        System.out.println("Doctor: " + p1.getDoctorName());

        p1.setRoomNumber(121);
        System.out.println("Room Number: " + p1.getRoomNumber());

        p1.setStatus("Admitted");
        System.out.println("Status: " + p1.getStatus());

        Patient p2 = new Patient();

        p2.setPatientName("Snehit");
        System.out.println("Patient Name: " + p2.getPatientName());

        p2.setAge(22);
        System.out.println("Age: " + p2.getAge());

        p2.setDisease("Diabetes");
        System.out.println("Disease: " + p2.getDisease());

        p2.setWeight(80.0);
        System.out.println("Weight: " + p2.getWeight());

        p2.setDoctorName("Dr. Verma");
        System.out.println("Doctor: " + p2.getDoctorName());

        p2.setRoomNumber(24);
        System.out.println("Room Number: " + p2.getRoomNumber());

        p2.setStatus("Under Observation");
        System.out.println("Status: " + p2.getStatus());

        Patient p3 = new Patient();

        p3.setPatientName("Sharan");
        System.out.println("Patient Name: " + p3.getPatientName());

        p3.setAge(29);
        System.out.println("Age: " + p3.getAge());

        p3.setDisease("Infection");
        System.out.println("Disease: " + p3.getDisease());

        p3.setWeight(68.2);
        System.out.println("Weight: " + p3.getWeight());

        p3.setDoctorName("Dr. Kapoor");
        System.out.println("Doctor: " + p3.getDoctorName());

        p3.setRoomNumber(30);
        System.out.println("Room Number: " + p3.getRoomNumber());

        p3.setStatus("Discharged");
        System.out.println("Status: " + p3.getStatus());

        Patient p4 = new Patient();

        p4.setPatientName("Rakshit");
        System.out.println("Patient Name: " + p4.getPatientName());

        p4.setAge(20);
        System.out.println("Age: " + p4.getAge());

        p4.setDisease("Heart Disease");
        System.out.println("Disease: " + p4.getDisease());

        p4.setWeight(85.0);
        System.out.println("Weight: " + p4.getWeight());

        p4.setDoctorName("Dr. Mehta");
        System.out.println("Doctor: " + p4.getDoctorName());

        p4.setRoomNumber(44);
        System.out.println("Room Number: " + p4.getRoomNumber());

        p4.setStatus("Critical");
        System.out.println("Status: " + p4.getStatus());

        Patient p5 = new Patient();

        p5.setPatientName("Siddu");
        System.out.println("Patient Name: " + p5.getPatientName());

        p5.setAge(28);
        System.out.println("Age: " + p5.getAge());

        p5.setDisease("Allergy");
        System.out.println("Disease: " + p5.getDisease());

        p5.setWeight(72.5);
        System.out.println("Weight: " + p5.getWeight());

        p5.setDoctorName("Dr. Rao");
        System.out.println("Doctor: " + p5.getDoctorName());

        p5.setRoomNumber(25);
        System.out.println("Room Number: " + p5.getRoomNumber());

        p5.setStatus("Stable");
        System.out.println("Status: " + p5.getStatus());

    }
}