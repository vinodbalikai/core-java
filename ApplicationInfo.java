class ApplicationInfo{
	private int appId;
	private String appName;
	private String appVersion;
	private String appDownloads;
	private String appRequiredOs;
	
			//System.out.println("The App Id is: "+appInfo.getAppId());
	
	
	public void setAppId(int appId){
		this.appId=appId;
	}
	public int getAppId(){
		return this.appId;
	}
	
	public void setAppName(String appName){
		this.appName=appName;
	}
	public String getAppName(){
		return this.appName;
	}
	
	public void setAppVersion(String appVersion){
		this.appVersion=appVersion;
	}
	public String getAppVersion(){
		return this.appVersion;
	}
	
	public void setAppDownloads(String appDownloads){
		this.appDownloads=appDownloads;
	}
	public String getAppDownloads(){
		return this.appDownloads;
	}
	
	public void setAppRequiredOs(String appRequiredOs){
		this.appRequiredOs=appRequiredOs;
	}
	public String getAppRequiredOs(){
		return this.appRequiredOs;
	}
	
	
}