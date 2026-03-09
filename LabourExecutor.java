class LabourExecutor{
 public static void main(String[] args){
	Labour lb = new Labour();
	
	String name="Suresh";
	lb.name=name;
	System.out.println("The labour name is:" +lb.name);
	
	double salary=18000;
	lb.salary=salary;
	System.out.println("The salary of labour is:" +lb.salary);
	
	String[] idProofs={"LB452", "LB663", "LB910"};
	System.out.println("The Id proof of labour are:");
	lb.idProofs=idProofs;
	for(String lists: lb.idProofs){
	   System.out.println(lists + " ");
	   }
	  }
}