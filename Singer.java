class Singer{
 String singerName[]= new String[5];
 int index=0;
 
 public boolean addSingerNames(String singer){
   boolean isSingerAdded=false;
   if(singer!=null && !singer.isEmpty()){
       singerName[index]=singer;
	   index++;
	  isSingerAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isSingerAdded;
 }
 
 public void getSingerNames(){
   for(String singers: singerName){
       if(singers!=null){
	      System.out.println(singers);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<singerName.length){
	  name=singerName[index];
	  System.out.println("The singer name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:singerName){
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

  public boolean updateSingerName(String existingName, String updatedName){
    boolean isSingerUpdated=false;
    for(int i=0; i<singerName.length; i++){
      if(singerName[i]==existingName){
        singerName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isSingerUpdated=true;
      }
    }
    if(isSingerUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isSingerUpdated;
  }
  public boolean deleteSingerName(String name){
    boolean isSingerDeleted=false;
    for(int i=0; i<singerName.length; i++){
      if(singerName[i]!=null && singerName[i]==name){
        singerName[i]=null;
        System.out.println(name +" is deleted");
        isSingerDeleted=true;
      }
    }
    if(isSingerDeleted==false){
      System.out.println(name +"not in list");
    }
    return isSingerDeleted;
  }
  
 }