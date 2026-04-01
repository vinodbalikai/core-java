class ApplicationInfoExecutor{
	public static void main(String[] app){
		
		ApplicationInfo appInfo=new ApplicationInfo();
		
		appInfo.setAppId(17);
		int appId=appInfo.getAppId();
		System.out.println("The App Id is: "+appId);
		//System.out.println("The App Id is: "+appInfo.getAppId());
		
		appInfo.setAppName("HD-Connect");
		String appName=appInfo.getAppName();
		System.out.println("The App Name is: "+appName);
		
		appInfo.setAppVersion("2.0");
		String appVersion=appInfo.getAppVersion();
		System.out.println("The App Version is: "+appVersion);
		
		appInfo.setAppDownloads("10,000+");
		String appDownloads=appInfo.getAppDownloads();
		System.out.println("The App Downloads are: "+appDownloads);
		
		appInfo.setAppRequiredOs("Android 10 and up");
		String appRequiredOs=appInfo.getAppRequiredOs();
		System.out.println("The required OS for the app is: "+appRequiredOs);
		
	}
}