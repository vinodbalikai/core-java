class Pasta{
 String pastaName[]= new String[5];
 int index=0;
 
 public boolean addPastaNames(String pasta){
   boolean isPastaAdded=false;
   if(pasta!=null && !pasta.isEmpty()){
       pastaName[index]=pasta;
	   index++;
	  isPastaAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isPastaAdded;
 }
 
 public void getPastaNames(){
   for(String pastas: pastaName){
       if(pastas!=null){
	      System.out.println(pastas);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<pastaName.length){
	  name=pastaName[index];
	  System.out.println("The pasta name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:pastaName){
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

  public boolean updatePastaName(String existingName, String updatedName){
    boolean isPastaUpdated=false;
    for(int i=0; i<pastaName.length; i++){
      if(pastaName[i]==existingName){
        pastaName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isPastaUpdated=true;
      }
    }
    if(isPastaUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isPastaUpdated;
  }
  public boolean deletePastaName(String name){
    boolean isPastaDeleted=false;
    for(int i=0; i<pastaName.length; i++){
      if(pastaName[i]!=null && pastaName[i]==name){
        pastaName[i]=null;
        System.out.println(name +" is deleted");
        isPastaDeleted=true;
      }
    }
    if(isPastaDeleted==false){
      System.out.println(name +"not in list");
    }
    return isPastaDeleted;
  }
  
 }