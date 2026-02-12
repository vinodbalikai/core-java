class FanRunner{
	public static void main(String[] fan){
		boolean status=Fan.onOrOf();
		System.out.println("The fan is running: "+status);
	}
}