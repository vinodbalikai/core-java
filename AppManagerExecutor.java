class AppManagerExecutor{
	public static void main(String[] apps){
		PlayStore playstore =new PlayStore();
		//String appNames[]= new String[4];
		//playstore.appNames=appNames;//we can also initilize in this way when only declaration is done in AppManager.
		String appName="Insta";
	    boolean isAdded=playstore.addAppName(appName);
		System.out.println("The " +appName +" is added: "+isAdded );
		appName="WhatsApp";
		isAdded=playstore.addAppName(appName);
		System.out.println("The " +appName +" is added: "+isAdded );
		
		appName="BGMI";
		isAdded=playstore.addAppName(appName);
		System.out.println("The " +appName +" is added: "+isAdded );
		
		appName="Snap";
		isAdded=playstore.addAppName(appName);
		System.out.println("The " +appName +" is added: "+isAdded );
		
		playstore.getAppNames();
		playstore.getAppNameByIndex(3);
		playstore.getAppIndexByName("Vinod");
		
	}
}