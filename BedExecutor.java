class BedExecutor{
   public static void main(String[] beds){
      Bed bed = new Bed();
	  bed.addBedNames("King");
	  bed.addBedNames("Queen");
	  bed.addBedNames("Single");
	  bed.addBedNames("Double");
	  bed.addBedNames("Bunk");
	  
	  bed.getBedNames();
	  
	  bed.getNameByIndex(0);
	  
	  bed.getIndexByName("King");

	  bed.updateBedName("Single", "SofaBed");

	  bed.deleteBedName("Queen");
	  
	   bed.getBedNames();
	  
	 }
 }