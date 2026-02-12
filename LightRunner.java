class LightRunner{
	public static void main(String[] light){
		boolean status=Light.onOrOf();
		System.out.println("The light is ON: "+status);
	}
}