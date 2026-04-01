class MedicineRunner {
    public static void main(String[] args) {

        Medicine medicine = new Medicine();

        medicine.setMedicineName("Paracetamol");
        System.out.println("Medicine Name: " + medicine.getMedicineName());

        medicine.setBrand("Dolo");
        System.out.println("Brand: " + medicine.getBrand());

        medicine.setType("Tablet");
        System.out.println("Type: " + medicine.getType());

        medicine.setPrice(25.50);
        System.out.println("Price: " + medicine.getPrice());

        medicine.setExpiryDate("Aug 2026");
        System.out.println("Expiry Date: " + medicine.getExpiryDate());

        medicine.setDosage("Twice a day");
        System.out.println("Dosage: " + medicine.getDosage());

        medicine.setManufacturer("Micro Labs");
        System.out.println("Manufacturer: " + medicine.getManufacturer());


        Medicine medicine1 = new Medicine();

        medicine1.setMedicineName("Amoxicilin");
        System.out.println("Medicine Name: " + medicine1.getMedicineName());

        medicine1.setBrand("Mox");
        System.out.println("Brand: " + medicine1.getBrand());

        medicine1.setType("Capsule");
        System.out.println("Type: " + medicine1.getType());

        medicine1.setPrice(78.00);
        System.out.println("Price: " + medicine1.getPrice());

        medicine1.setExpiryDate("Jan 2027");
        System.out.println("Expiry Date: " + medicine1.getExpiryDate());

        medicine1.setDosage("After food");
        System.out.println("Dosage: " + medicine1.getDosage());

        medicine1.setManufacturer("Cipla");
        System.out.println("Manufacturer: " + medicine1.getManufacturer());


        Medicine medicine2 = new Medicine();

        medicine2.setMedicineName("Cetrizin");
        System.out.println("Medicine Name: " + medicine2.getMedicineName());

        medicine2.setBrand("Citra");
        System.out.println("Brand: " + medicine2.getBrand());

        medicine2.setType("Tablet");
        System.out.println("Type: " + medicine2.getType());

        medicine2.setPrice(18.75);
        System.out.println("Price: " + medicine2.getPrice());

        medicine2.setExpiryDate("Nov 2026");
        System.out.println("Expiry Date: " + medicine2.getExpiryDate());

        medicine2.setDosage("Night");
        System.out.println("Dosage: " + medicine2.getDosage());

        medicine2.setManufacturer("GSK");
        System.out.println("Manufacturer: " + medicine2.getManufacturer());

    }
}