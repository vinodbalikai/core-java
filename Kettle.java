class Kettle{
 String kettleName[]= new String[5];
 int index=0;
 
 public boolean addKettleNames(String kettle){
   boolean isKettleAdded=false;
   if(kettle!=null && !kettle.isEmpty()){
       kettleName[index]=kettle;
	   index++;
	  isKettleAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isKettleAdded;
 }
 
 public void getKettleNames(){
   for(String kettles: kettleName){
       if(kettles!=null){
	      System.out.println(kettles);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<kettleName.length){
	  name=kettleName[index];
	  System.out.println("The kettle name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:kettleName){
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

  public boolean updateKettleName(String existingName, String updatedName){
    boolean isKettleUpdated=false;
    for(int i=0; i<kettleName.length; i++){
      if(kettleName[i]==existingName){
        kettleName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isKettleUpdated=true;
      }
    }
    if(isKettleUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isKettleUpdated;
  }
  public boolean deleteKettleName(String name){
    boolean isKettleDeleted=false;
    for(int i=0; i<kettleName.length; i++){
      if(kettleName[i]!=null && kettleName[i]==name){
        kettleName[i]=null;
        System.out.println(name +" is deleted");
        isKettleDeleted=true;
      }
    }
    if(isKettleDeleted==false){
      System.out.println(name +"not in list");
    }
    return isKettleDeleted;
  }
  
 }