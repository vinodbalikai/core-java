class LightRunner{
	public static void main(String[] light){
		boolean status=Light.onOrOf();
		//System.out.println("The light is ON: "+status);
		Light.increaseIntensity();
		System.out.println(" ");
		Light.increaseIntensity();
		System.out.println(" ");
		Light.decreaseIntensity();
		System.out.println(" ");
		Light.decreaseIntensity();
		System.out.println(" ");
	}
}