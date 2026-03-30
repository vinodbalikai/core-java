class SingerExecutor{
   public static void main(String[] singers){
      Singer singer = new Singer();
	  singer.addSingerNames("Arijit");
	  singer.addSingerNames("Sonu");
	  singer.addSingerNames("Shreya");
	  singer.addSingerNames("SPB");
	  singer.addSingerNames("Chitra");
	  
	  singer.getSingerNames();
	  
	  singer.getNameByIndex(0);
	  
	  singer.getIndexByName("Arijit");

	  singer.updateSingerName("Shreya", "Sunidhi");

	  singer.deleteSingerName("Sonu");
	  
	   singer.getSingerNames();
	  
	 }
 }