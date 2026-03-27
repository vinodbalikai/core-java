class AppManager{
	private String appNames[]= new String[4];
	int index;
		//public String appNames[];// only declaration is done here but initialization is done after object creation.
	public boolean addAppName(String appName){
		boolean isAppAdded=false;
		if(index <appNames.length){
			if(appName!=null && !appName.isEmpty()){
			  appNames[index++]=appName;
			  isAppAdded=true;
		}
		  else{
			System.out.println("App name "+appName+" is invalid");
	}	
		}else System.out.println("The appNames array is full");

		return isAppAdded;
	}
	public void getAppNames(){
		System.out.println("The apps in AppManger are : ");
		for(String app:appNames){
		   System.out.println(app);

		}
	}
	public void getAppNameByIndex(int index){
		if(index<appNames.length){
			System.out.println("The App name at index "+index+ " is: "+appNames[index]);
		}else System.out.println("The index is out of range");
		
	}
	public void getAppIndexByName(String name){
		int index=0;
		boolean isNamePresent=false;
		for(String appname:appNames){
			if(name==appname){
				System.out.println("The index of app name "+name+ " is: "+index);
				isNamePresent=true;
			}
			index++;
		}
		if(!isNamePresent){
			System.out.println("The name " +name+ " is not found in the array");
		}
	}
}