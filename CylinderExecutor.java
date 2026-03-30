class CylinderExecutor{
   public static void main(String[] cylinders){
      Cylinder cylinder = new Cylinder();
	  cylinder.addCylinderNames("HP");
	  cylinder.addCylinderNames("Indane");
	  cylinder.addCylinderNames("Bharat");
	  cylinder.addCylinderNames("Total");
	  cylinder.addCylinderNames("SuperGas");
	  
	  cylinder.getCylinderNames();
	  
	  cylinder.getNameByIndex(0);
	  
	  cylinder.getIndexByName("HP");

	  cylinder.updateCylinderName("Bharat", "MysoreGas");

	  cylinder.deleteCylinderName("Indane");
	  
	   cylinder.getCylinderNames();
	  
	 }
 }