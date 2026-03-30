class Turbine{
 String turbineName[]= new String[5];
 int index=0;
 
 public boolean addTurbineNames(String turbine){
   boolean isTurbineAdded=false;
   if(turbine!=null && !turbine.isEmpty()){
       turbineName[index]=turbine;
	   index++;
	  isTurbineAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isTurbineAdded;
 }
 
 public void getTurbineNames(){
   for(String turbines: turbineName){
       if(turbines!=null){
	      System.out.println(turbines);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<turbineName.length){
	  name=turbineName[index];
	  System.out.println("The turbine name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:turbineName){
      if(name!=null && name==names){
          System.out.println("The index of the " +name+ " is: " +index);
		  isNameFound=true;
      }
      index++;
    }
	if(!isNameFound){
	 System.out.println("The name " +names+ " is not found in the array");
		}
		return isNameFound;
  }

  public boolean updateTurbineName(String existingName, String updatedName){
    boolean isTurbineUpdated=false;
    for(int i=0; i<turbineName.length; i++){
      if(turbineName[i]==existingName){
        turbineName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isTurbineUpdated=true;
      }
    }
    if(isTurbineUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isTurbineUpdated;
  }
  public boolean deleteTurbineName(String name){
    boolean isTurbineDeleted=false;
    for(int i=0; i<turbineName.length; i++){
      if(turbineName[i]!=null && turbineName[i]==name){
        turbineName[i]=null;
        System.out.println(name +" is deleted");
        isTurbineDeleted=true;
      }
    }
    if(isTurbineDeleted==false){
      System.out.println(name +"not in list");
    }
    return isTurbineDeleted;
  }
  
 }