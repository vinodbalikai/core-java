class ProjectorExecuter{
	public static void main(String [] pro){
		Double price =Projector.getPrice();
        System.out.println("The price of the projector is: "+price);
		
		String brand=Projector.getBrand();
		System.out.println("The brand of the projector is: "+brand);
		
		int brightness=Projector.getBrightness();
		System.out.println("The brightness is: "+brightness+" lumens");
		
		String resolution=Projector.getResolution();
		System.out.println("The resolution is: "+resolution);
		
		String lamp=Projector.getLampType();
		System.out.println("The lamp type is: "+lamp);
		
		boolean hdmi=Projector.supportsHDMI();
		System.out.println("Supports HDMI: "+hdmi);
	}
}