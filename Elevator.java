class Elevator {
    static String brand;
    static String type;
    static int capacity;
    static int floors;
    static String speed;
    static String location;
    static boolean emergencyAlarm;
    public static boolean createElevator(
            String l, int f, String b,
            String s, int c, String t,
            boolean ea) {
        boolean isCreated = false;
        boolean v1=false,v2=false,v3=false,
                v4=false,v5=false,v6=false;

        if(l!=null && !l.isEmpty()){
            System.out.println("Installation location verified : " + l);
            location=l; v6=true;
        }else{
            System.out.println("Invalid location data");
        }
        if(b!=null && !b.isEmpty()){
            System.out.println("Elevator brand recorded : " + b);
            brand=b; v1=true;
        }else{
            System.out.println("Brand entry incorrect");
        }
        if(c>0){
            System.out.println("Lift capacity accepted : " + c);
            capacity=c; v3=true;
        }else{
            System.out.println("Capacity value invalid");
        }

        if(t!=null && !t.isEmpty()){
            System.out.println("Elevator category confirmed : " + t);
            type=t; v2=true;
        }else{
            System.out.println("Type information missing");
        }

        if(f>0){
            System.out.println("Number of floors supported : " + f);
            floors=f; v4=true;
        }else{
            System.out.println("Floor count invalid");
        }

        if(s!=null && !s.isEmpty()){
            System.out.println("Operating speed stored : " + s);
            speed=s; v5=true;
        }else{
            System.out.println("Speed value incorrect");
        }

        if(v1 && v2 && v3 && v4 && v5 && v6){
            emergencyAlarm = ea;
            System.out.println("Elevator configuration completed successfully.\n");
            isCreated=true;
        }else{
            System.out.println("Elevator configuration failed.\n");
        }

        return isCreated;
    }
    public static void getElevatorDetails(){
        System.out.println("Stored Elevator Information");
        System.out.println("Brand Name : " + brand);
        System.out.println("Elevator Type : " + type);
        System.out.println("Max Capacity : " + capacity);
        System.out.println("Supported Floors : " + floors);
        System.out.println("Speed Category : " + speed);
        System.out.println("Installed At : " + location);
        System.out.println("Emergency Alarm Enabled : " + emergencyAlarm);
    }
}
