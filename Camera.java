class Camera{

    static String brand;
    static String model;
    static int megapixel;
    static int zoom;
    static String color;
    static String lens;
    static String battery;
    static int price;
    static int warranty;
    static boolean wifi;

    public static boolean createCamera(String b,String m,int mp,int z,String c,String l,String bt,int p,int w,boolean wf){
        boolean isCreated=false;
        boolean isBrandValid=false;
        boolean isModelValid=false;
        boolean isMpValid=false;
        boolean isZoomValid=false;
        boolean isColorValid=false;
        boolean isLensValid=false;
        boolean isBatteryValid=false;
        boolean isPriceValid=false;
        boolean isWarrantyValid=false;
        if(p>0){
            System.out.println("Price accepted and stored : " + p);
            price=p;
            isPriceValid=true;
        }else{
            System.out.println("Entered price is not valid");
        }
        if(b!=null && !b.isEmpty()){
            System.out.println("Camera brand verified : " + b);
            brand=b;
            isBrandValid=true;
        }else{
            System.out.println("Brand information missing");
        }
        if(c!=null && !c.isEmpty()){
            System.out.println("Camera color recorded : " + c);
            color=c;
            isColorValid=true;
        }else{
            System.out.println("Color value is invalid");
        }
        if(mp>0){
            System.out.println("Image resolution confirmed (MP) : " + mp);
            megapixel=mp;
            isMpValid=true;
        }else{
            System.out.println("Megapixel value must be greater than zero");
        }
        if(bt!=null && !bt.isEmpty()){
            System.out.println("Battery specification saved : " + bt);
            battery=bt;
            isBatteryValid=true;
        }else{
            System.out.println("Battery details not provided correctly");
        }

        if(z>0){
            System.out.println("Zoom capability validated : " + z + "x");
            zoom=z;
            isZoomValid=true;
        }else{
            System.out.println("Zoom value invalid");
        }
        if(m!=null && !m.isEmpty()){
            System.out.println("Model name confirmed : " + m);
            model=m;
            isModelValid=true;
        }else{
            System.out.println("Model name cannot be empty");
        }

        if(l!=null && !l.isEmpty()){
            System.out.println("Lens type registered : " + l);
            lens=l;
            isLensValid=true;
        }else{
            System.out.println("Lens information invalid");
        }
        if(w>=0){
            System.out.println("Warranty period accepted : " + w + " years");
            warranty=w;
            isWarrantyValid=true;
        }else{
            System.out.println("Warranty value cannot be negative");
        }
        if(isBrandValid && isModelValid && isMpValid &&
           isZoomValid && isColorValid && isLensValid &&
           isBatteryValid && isPriceValid && isWarrantyValid){

            wifi=wf;
            System.out.println("Camera successfully created and stored.\n");
            isCreated=true;
        }
        else{
            System.out.println("Camera creation failed due to invalid inputs.\n");
        }
        return isCreated;
    }
    public static void getCameraDetails(){
        System.out.println("Camera Stored");
        System.out.println("Stored Camera Brand : " + brand);
        System.out.println("Stored Camera Model : " + model);
        System.out.println("Resolution (Megapixel) : " + megapixel);
        System.out.println("Optical Zoom Level : " + zoom);
        System.out.println("Body Color : " + color);
        System.out.println("Lens Information : " + lens);
        System.out.println("Battery Details : " + battery);
        System.out.println("Camera Price : " + price);
        System.out.println("Warranty Duration : " + warranty + " years");
        System.out.println("WiFi Support Available : " + wifi);
    }
}