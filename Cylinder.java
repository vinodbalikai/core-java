class Cylinder{
 String cylinderName[]= new String[5];
 int index=0;
 
 public boolean addCylinderNames(String cylinder){
   boolean isCylinderAdded=false;
   if(cylinder!=null && !cylinder.isEmpty()){
       cylinderName[index]=cylinder;
	   index++;
	  isCylinderAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isCylinderAdded;
 }
 
 public void getCylinderNames(){
   for(String cylinders: cylinderName){
       if(cylinders!=null){
	      System.out.println(cylinders);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<cylinderName.length){
	  name=cylinderName[index];
	  System.out.println("The cylinder name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:cylinderName){
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

  public boolean updateCylinderName(String existingName, String updatedName){
    boolean isCylinderUpdated=false;
    for(int i=0; i<cylinderName.length; i++){
      if(cylinderName[i]==existingName){
        cylinderName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isCylinderUpdated=true;
      }
    }
    if(isCylinderUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isCylinderUpdated;
  }
  public boolean deleteCylinderName(String name){
    boolean isCylinderDeleted=false;
    for(int i=0; i<cylinderName.length; i++){
      if(cylinderName[i]!=null && cylinderName[i]==name){
        cylinderName[i]=null;
        System.out.println(name +" is deleted");
        isCylinderDeleted=true;
      }
    }
    if(isCylinderDeleted==false){
      System.out.println(name +"not in list");
    }
    return isCylinderDeleted;
  }
  
 }