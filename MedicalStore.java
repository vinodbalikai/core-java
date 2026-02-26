class MedicalStore {

    static String dosage;
    static String medicineName;
    static boolean prescriptionRequired;
    static int price;
    static String manufacturer;
    static String expiryDate;
    static String type;

    public static boolean createMedicine(String mn,String mf,String t,int p,String ed,String d,boolean pr) {

        boolean isCreated = false;

        boolean v3=false,v1=false,v6=false,
                v4=false,v2=false,v5=false;

        if(t!=null && !t.isEmpty()){
            type=t;
            System.out.println("Type validated : " + t);
            v3=true;
        }else{ System.out.println("Type invalid"); }

        if(mn!=null && !mn.isEmpty()){
            medicineName=mn;
            System.out.println("Medicine validated : " + mn);
            v1=true;
        }else{ System.out.println("Medicine invalid"); }

        if(d!=null && !d.isEmpty()){
            dosage=d;
            System.out.println("Dosage validated : " + d);
            v6=true;
        }else{ System.out.println("Dosage invalid"); }

        if(p>0){
            price=p;
            System.out.println("Price validated : " + p);
            v4=true;
        }else{ System.out.println("Price invalid"); }

        if(mf!=null && !mf.isEmpty()){
            manufacturer=mf;
            System.out.println("Manufacturer validated : " + mf);
            v2=true;
        }else{ System.out.println("Manufacturer invalid"); }

        if(ed!=null && !ed.isEmpty()){
            expiryDate=ed;
            System.out.println("Expiry validated : " + ed);
            v5=true;
        }else{ System.out.println("Expiry invalid"); }

        if(v3 && v1 && v6 && v4 && v2 && v5){
            prescriptionRequired=pr;
            isCreated=true;
            System.out.println("All Medicine Details Validated\n");
        }else{
            System.out.println("Medicine Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getMedicineDetails(){

        System.out.println("Dosage : " + dosage);
        System.out.println("Last Medicine Stored");
        System.out.println("Medicine : " + medicineName);
        System.out.println("Type : " + type);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Price : " + price);
        System.out.println("Expiry Date : " + expiryDate);
        System.out.println("Prescription Required : " + prescriptionRequired);
    }
}
