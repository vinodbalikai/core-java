class TurbineExecutor{
   public static void main(String[] turbines){
      Turbine turbine = new Turbine();
	  turbine.addTurbineNames("Steam");
	  turbine.addTurbineNames("Gas");
	  turbine.addTurbineNames("Wind");
	  turbine.addTurbineNames("Hydro");
	  turbine.addTurbineNames("Kaplan");
	  
	  turbine.getTurbineNames();
	  
	  turbine.getNameByIndex(0);
	  
	  turbine.getIndexByName("Steam");

	  turbine.updateTurbineName("Wind", "Francis");

	  turbine.deleteTurbineName("Gas");
	  
	   turbine.getTurbineNames();
	  
	 }
 }