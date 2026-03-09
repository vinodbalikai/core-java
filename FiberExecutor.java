class FiberExecutor{
 public static void main(String[] args){
    Fiber fb = new Fiber();
	
	String name="OptiNet";
	fb.name=name;
	System.out.println("The Fiber name is:" +fb.name);
	
	String name1="SpeedLink";
	fb.name=name1;
	System.out.println(fb.name);
	
	double length=250;
	fb.length=length;
	System.out.println("The length of fiber is:" +fb.length);
	
	String[] vendors={"ACT", "Hathway", "Tikona"};
	fb.vendors=vendors;
	System.out.println("List of vendors are:" );
	for(String lists: fb.vendors)
		System.out.println(lists + " ");
 }
}