class KettleExecutor{
   public static void main(String[] kettles){
      Kettle kettle = new Kettle();
	  kettle.addKettleNames("Prestige");
	  kettle.addKettleNames("Pigeon");
	  kettle.addKettleNames("Philips");
	  kettle.addKettleNames("Bajaj");
	  kettle.addKettleNames("Havells");
	  
	  kettle.getKettleNames();
	  
	  kettle.getNameByIndex(0);
	  
	  kettle.getIndexByName("Prestige");

	  kettle.updateKettleName("Philips", "Butterfly");

	  kettle.deleteKettleName("Pigeon");
	  
	   kettle.getKettleNames();
	  
	 }
 }