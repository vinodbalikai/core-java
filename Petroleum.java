class Petroleum{
 String petroleumName[]= new String[5];
 int index=0;
 
 public boolean addPetroleumNames(String petroleum){
   boolean isPetroleumAdded=false;
   if(petroleum!=null && !petroleum.isEmpty()){
       petroleumName[index]=petroleum;
	   index++;
	  isPetroleumAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isPetroleumAdded;
 }
 
 public void getPetroleumNames(){
   for(String petroleums: petroleumName){
       if(petroleums!=null){
	      System.out.println(petroleums);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<petroleumName.length){
	  name=petroleumName[index];
	  System.out.println("The petroleum name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:petroleumName){
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

  public boolean updatePetroleumName(String existingName, String updatedName){
    boolean isPetroleumUpdated=false;
    for(int i=0; i<petroleumName.length; i++){
      if(petroleumName[i]==existingName){
        petroleumName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isPetroleumUpdated=true;
      }
    }
    if(isPetroleumUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isPetroleumUpdated;
  }
  public boolean deletePetroleumName(String name){
    boolean isPetroleumDeleted=false;
    for(int i=0; i<petroleumName.length; i++){
      if(petroleumName[i]!=null && petroleumName[i]==name){
        petroleumName[i]=null;
        System.out.println(name +" is deleted");
        isPetroleumDeleted=true;
      }
    }
    if(isPetroleumDeleted==false){
      System.out.println(name +"not in list");
    }
    return isPetroleumDeleted;
  }
  
 }