class Medicine {

    private String medicineName;
    private String brand;
    private String type;
    private double price;
    private String expiryDate;
    private String dosage;
    private String manufacturer;

    public void setMedicineName(String medicineName){
        this.medicineName = medicineName;
    }
    public String getMedicineName(){
        return this.medicineName;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }
    public String getExpiryDate(){
        return this.expiryDate;
    }

    public void setDosage(String dosage){
        this.dosage = dosage;
    }
    public String getDosage(){
        return this.dosage;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
}