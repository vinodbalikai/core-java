class AirConditionerExecutor{
public static void main(String[] args){
	AirConditioner ac = new AirConditioner();
	
	ac.brand="Boat";
	System.out.println("The brand of air conditioner is:" +ac.brand);
	
	ac.model="BT25";
	System.out.println("The model of air conditioner is:" +ac.model);
	
	ac.price=22000;
	System.out.println("The price of air conditioner is:" +ac.price);
	
	ac.type="Split";
	System.out.println("The type of air conditioner is:" +ac.type);
	
	ac.weight=20;
	System.out.println("The weight of air conditioner is:" +ac.weight);
	
	String[] colors={"White", "Silver", "Grey"};
	System.out.println("Lists of AirConditioner colors:");
	ac.colors=colors;
	for(String AC:ac.colors){
	   System.out.println(AC+ " ");
	   }
	  
	ac.warranty=10;
	System.out.println("Warranty of AirConditioner in years:" +ac.warranty);
	
	boolean working=false;
	ac.working=working;
	System.out.println("Status of AirConditioner is:" +ac.working);
	}
}