class Refrigerator {

    static String energyRating;
    static int doors;
    static String brand;
    static String color;
    static int price;
    static String model;
    static boolean inverterTechnology;
    static String type;
    static int warranty;
    static int capacity;

    public static boolean createRefrigerator(String b,String m,int cap,String t,String c,int p,int w,String er,boolean it,int d) {
        boolean isCreated = false;
        boolean isEnergyValid = false;
        boolean isDoorsValid = false;
        boolean isBrandValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isModelValid = false;
        boolean isTypeValid = false;
        boolean isWarrantyValid = false;
        boolean isCapacityValid = false;

        if (er != null && !er.isEmpty()) {
            energyRating = er;
            System.out.println("Energy Rating validated : " + er);
            isEnergyValid = true;
        } else {
            System.out.println("Energy Rating invalid");
        }

        if (d > 0) {
            doors = d;
            System.out.println("Doors validated : " + d);
            isDoorsValid = true;
        } else {
            System.out.println("Doors invalid");
        }

        if (b != null && !b.isEmpty()) {
            brand = b;
            System.out.println("Brand validated : " + b);
            isBrandValid = true;
        } else {
            System.out.println("Brand invalid");
        }

        if (c != null && !c.isEmpty()) {
            color = c;
            System.out.println("Color validated : " + c);
            isColorValid = true;
        } else {
            System.out.println("Color invalid");
        }

        if (p > 0) {
            price = p;
            System.out.println("Price validated : " + p);
            isPriceValid = true;
        } else {
            System.out.println("Price invalid");
        }

        if (m != null && !m.isEmpty()) {
            model = m;
            System.out.println("Model validated : " + m);
            isModelValid = true;
        } else {
            System.out.println("Model invalid");
        }

        if (t != null && !t.isEmpty()) {
            type = t;
            System.out.println("Type validated : " + t);
            isTypeValid = true;
        } else {
            System.out.println("Type invalid");
        }

        if (w >= 0) {
            warranty = w;
            System.out.println("Warranty validated : " + w);
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty invalid");
        }

        if (cap > 0) {
            capacity = cap;
            System.out.println("Capacity validated : " + cap);
            isCapacityValid = true;
        } else {
            System.out.println("Capacity invalid");
        }

        if (isEnergyValid && isDoorsValid && isBrandValid &&
            isColorValid && isPriceValid && isModelValid &&
            isTypeValid && isWarrantyValid && isCapacityValid) {

            inverterTechnology = it;
            System.out.println("All Refrigerator Details Validated\n");
            isCreated = true;

        } else {
            System.out.println("Refrigerator Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getRefrigeratorDetails() {

        System.out.println("Energy Rating : " + energyRating);
        System.out.println("----- Last Refrigerator Stored -----");
        System.out.println("Brand : " + brand);
        System.out.println("Doors : " + doors);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Type : " + type);
        System.out.println("Warranty : " + warranty);
        System.out.println("Capacity : " + capacity);
        System.out.println("Inverter Technology : " + inverterTechnology);
    }
}
