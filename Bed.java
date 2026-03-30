class Bed{
 String bedName[]= new String[5];
 int index=0;
 
 public boolean addBedNames(String bed){
   boolean isBedAdded=false;
   if(bed!=null && !bed.isEmpty()){
       bedName[index]=bed;
	   index++;
	  isBedAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isBedAdded;
 }
 
 public void getBedNames(){
   for(String beds: bedName){
       if(beds!=null){
	      System.out.println(beds);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<bedName.length){
	  name=bedName[index];
	  System.out.println("The bed name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:bedName){
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

  public boolean updateBedName(String existingName, String updatedName){
    boolean isBedUpdated=false;
    for(int i=0; i<bedName.length; i++){
      if(bedName[i]==existingName){
        bedName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isBedUpdated=true;
      }
    }
    if(isBedUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isBedUpdated;
  }
  public boolean deleteBedName(String name){
    boolean isBedDeleted=false;
    for(int i=0; i<bedName.length; i++){
      if(bedName[i]!=null && bedName[i]==name){
        bedName[i]=null;
        System.out.println(name +" is deleted");
        isBedDeleted=true;
      }
    }
    if(isBedDeleted==false){
      System.out.println(name +"not in list");
    }
    return isBedDeleted;
  }
  
 }