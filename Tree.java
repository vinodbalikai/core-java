class Tree{
 String treeName[]= new String[5];
 int index=0;
 
 public boolean addTreeNames(String tree){
   boolean isTreeAdded=false;
   if(tree!=null && !tree.isEmpty()){
       treeName[index]=tree;
	   index++;
	  isTreeAdded=true;
	   }
	else System.out.println("Can not add/Invalid Input");
	return isTreeAdded;
 }
 
 public void getTreeNames(){
   for(String trees: treeName){
       if(trees!=null){
	      System.out.println(trees);
		  }
		 }
	   }
 
 public String getNameByIndex(int index){
    String name=null;
	if(index<treeName.length){
	  name=treeName[index];
	  System.out.println("The tree name at the index " +index+ " is: " +name);
	  }
	else System.out.println("Invalid index");
    return name;
   }

 public boolean getIndexByName(String names){
   int index=0;
   boolean isNameFound=false;
   for(String name:treeName){
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

  public boolean updateTreeName(String existingName, String updatedName){
    boolean isTreeUpdated=false;
    for(int i=0; i<treeName.length; i++){
      if(treeName[i]==existingName){
        treeName[i]=updatedName;
        System.out.println(existingName + " is updated to: " +updatedName);
        isTreeUpdated=true;
      }
    }
    if(isTreeUpdated==false){
      System.out.println(existingName + " is not in the list");
    }
    return isTreeUpdated;
  }
  public boolean deleteTreeName(String name){
    boolean isTreeDeleted=false;
    for(int i=0; i<treeName.length; i++){
      if(treeName[i]!=null && treeName[i]==name){
        treeName[i]=null;
        System.out.println(name +" is deleted");
        isTreeDeleted=true;
      }
    }
    if(isTreeDeleted==false){
      System.out.println(name +"not in list");
    }
    return isTreeDeleted;
  }
  
 }