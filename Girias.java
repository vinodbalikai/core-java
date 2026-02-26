class Girias{

    static int price;
    static String energyRating;
    static String brand;
    static int spinSpeed;
    static String model;
    static boolean inverterTechnology;
    static String color;
    static int warranty;
    static String type;
    static int capacity;

    public static boolean createWashingMachine(String b,String m,String t,int cap,String c,int p,int w,String er,boolean it,int ss){

        boolean isCreated=false;

        boolean isEnergyValid=false;
        boolean isTypeValid=false;
        boolean isBrandValid=false;
        boolean isSpinValid=false;
        boolean isModelValid=false;
        boolean isPriceValid=false;
        boolean isWarrantyValid=false;
        boolean isCapacityValid=false;
        boolean isColorValid=false;

        if(er!=null && !er.isEmpty()){
            energyRating=er;
            System.out.println("Energy Rating validated : " + er);
            isEnergyValid=true;
        }else{
            System.out.println("Energy Rating invalid");
        }

        if(t!=null && !t.isEmpty()){
            type=t;
            System.out.println("Type validated : " + t);
            isTypeValid=true;
        }else{
            System.out.println("Type invalid");
        }

        if(b!=null && !b.isEmpty()){
            brand=b;
            System.out.println("Brand validated : " + b);
            isBrandValid=true;
        }else{
            System.out.println("Brand invalid");
        }

        if(ss>0){
            spinSpeed=ss;
            System.out.println("Spin Speed validated : " + ss);
            isSpinValid=true;
        }else{
            System.out.println("Spin Speed invalid");
        }

        if(m!=null && !m.isEmpty()){
            model=m;
            System.out.println("Model validated : " + m);
            isModelValid=true;
        }else{
            System.out.println("Model invalid");
        }

        if(p>0){
            price=p;
            System.out.println("Price validated : " + p);
            isPriceValid=true;
        }else{
            System.out.println("Price invalid");
        }

        if(w>=0){
            warranty=w;
            System.out.println("Warranty validated : " + w);
            isWarrantyValid=true;
        }else{
            System.out.println("Warranty invalid");
        }

        if(cap>0){
            capacity=cap;
            System.out.println("Capacity validated : " + cap);
            isCapacityValid=true;
        }else{
            System.out.println("Capacity invalid");
        }

        if(c!=null && !c.isEmpty()){
            color=c;
            System.out.println("Color validated : " + c);
            isColorValid=true;
        }else{
            System.out.println("Color invalid");
        }

        if(isEnergyValid && isTypeValid && isBrandValid &&
           isSpinValid && isModelValid && isPriceValid &&
           isWarrantyValid && isCapacityValid && isColorValid){

            inverterTechnology=it;
            isCreated=true;
            System.out.println("All WashingMachine Details Validated\n");
        }
        else{
            System.out.println("WashingMachine Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getWashingMachineDetails(){

        System.out.println("Spin Speed : " + spinSpeed);
        System.out.println(" Last WashingMachine Stored ");
        System.out.println("Brand : " + brand);
        System.out.println("Energy Rating : " + energyRating);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Type : " + type);
        System.out.println("Warranty : " + warranty);
        System.out.println("Color : " + color);
        System.out.println("Capacity : " + capacity);
        System.out.println("Inverter Technology : " + inverterTechnology);
    }
}
