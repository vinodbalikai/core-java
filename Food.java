class Food{

    static String restaurant;
    static String taste;
    static int price;
    static String name;
    static String type;

    public static boolean createFood(String n,String t,String ta,int p,String r){

        boolean isCreated=false;

        boolean isRestaurantValid=false;
        boolean isTasteValid=false;
        boolean isNameValid=false;
        boolean isPriceValid=false;
        boolean isTypeValid=false;

        if(r!=null && !r.isEmpty()){
            restaurant=r;
            System.out.println("Restaurant validated : " + r);
            isRestaurantValid=true;
        }else{
            System.out.println("Restaurant invalid");
        }

        if(ta!=null && !ta.isEmpty()){
            taste=ta;
            System.out.println("Taste validated : " + ta);
            isTasteValid=true;
        }else{
            System.out.println("Taste invalid");
        }

        if(n!=null && !n.isEmpty()){
            name=n;
            System.out.println("Food Name validated : " + n);
            isNameValid=true;
        }else{
            System.out.println("Food Name invalid");
        }

        if(p>0){
            price=p;
            System.out.println("Price validated : " + p);
            isPriceValid=true;
        }else{
            System.out.println("Price invalid");
        }

        if(t!=null && !t.isEmpty()){
            type=t;
            System.out.println("Type validated : " + t);
            isTypeValid=true;
        }else{
            System.out.println("Type invalid");
        }

        if(isRestaurantValid && isTasteValid && isNameValid &&
           isPriceValid && isTypeValid){

            isCreated=true;
            System.out.println("All Food Details Validated\n");
        }
        else{
            System.out.println("Food Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getFoodDetails(){

        System.out.println("Restaurant : " + restaurant);
        System.out.println("Taste : " + taste);
        System.out.println("----- Last Food Stored -----");
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Type : " + type);
    }
}