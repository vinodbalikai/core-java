class Steel{
 String steelName[]= new String[5];
 int index=0;
 
 public boolean addSteelNames(String steel){
   boolean isSteelAdded=false;
   if(steel!=null && !steel.isEmpty()){
       steelName[index]=steel;
	   index++;
	  isSteelAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isSteelAdded;
 }
 
 public void getSteelNames(){
   for(String steels: steelName){
       if(steels!=null){
	      System.out.println(steels);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<steelName.length){
	  name=steelName[index];
	  System.out.println("The steel name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:steelName){
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

  public boolean updateSteelName(String existingName, String updatedName){
    boolean isSteelUpdated=false;
    for(int i=0; i<steelName.length; i++){
      if(steelName[i]==existingName){
        steelName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isSteelUpdated=true;
      }
    }
    if(isSteelUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isSteelUpdated;
  }
  public boolean deleteSteelName(String name){
    boolean isSteelDeleted=false;
    for(int i=0; i<steelName.length; i++){
      if(steelName[i]!=null && steelName[i]==name){
        steelName[i]=null;
        System.out.println(name +" is deleted");
        isSteelDeleted=true;
      }
    }
    if(isSteelDeleted==false){
      System.out.println(name +"not in list");
    }
    return isSteelDeleted;
  }
  
 }