class SteelExecutor{
   public static void main(String[] steels){
      Steel steel = new Steel();
	  steel.addSteelNames("Tata");
	  steel.addSteelNames("JSW");
	  steel.addSteelNames("SAIL");
	  steel.addSteelNames("Jindal");
	  steel.addSteelNames("Essar");
	  
	  steel.getSteelNames();
	  
	  steel.getNameByIndex(0);
	  
	  steel.getIndexByName("Tata");

	  steel.updateSteelName("SAIL", "VizagSteel");

	  steel.deleteSteelName("JSW");
	  
	   steel.getSteelNames();
	  
	 }
 }