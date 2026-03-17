class Duration{
  int dailyDuration;
  
  Duration(int dailyDuration){
    this.dailyDuration=dailyDuration;
	}
	
  public void getDurationDetails(){
	System.out.println("Getting duration Details");
    System.out.println("Daily duration in hours:" +this.dailyDuration);
	}
}