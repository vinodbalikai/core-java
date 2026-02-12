class TvRunner{
	public static void main(String[] tv){
		boolean status=Tv.onOrOf();
		//System.out.println("The TV is ON: "+status);
		
		Tv.increaseVolume();
		System.out.println(" ");
		Tv.increaseVolume();
		System.out.println(" ");
		
		Tv.decreaseVolume();
		System.out.println(" ");
		Tv.decreaseVolume();
		System.out.println(" ");
		
		}
}
