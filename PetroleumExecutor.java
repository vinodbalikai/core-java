class PetroleumExecutor{
   public static void main(String[] petroleums){
      Petroleum petroleum = new Petroleum();
	  petroleum.addPetroleumNames("Petrol");
	  petroleum.addPetroleumNames("Diesel");
	  petroleum.addPetroleumNames("Kerosene");
	  petroleum.addPetroleumNames("LPG");
	  petroleum.addPetroleumNames("CNG");
	  
	  petroleum.getPetroleumNames();
	  
	  petroleum.getNameByIndex(0);
	  
	  petroleum.getIndexByName("Petrol");

	  petroleum.updatePetroleumName("Kerosene", "ATF");

	  petroleum.deletePetroleumName("Diesel");
	  
	   petroleum.getPetroleumNames();
	  
	 }
 }